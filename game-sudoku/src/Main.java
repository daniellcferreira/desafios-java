import model.Board;
import model.Space;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

import static utils.BoardTemplate.BOARD_TEMPLATE;
import static java.util.Objects.isNull;
import static java.util.Objects.nonNull;

public class Main {

  private final static Scanner scanner = new Scanner(System.in);

  private static Board board;

  private final static int BOARD_LIMIT = 9;

  public static void main(String[] args) {
    Map<String, String> positions = generateSudokuBoard();

    var option = -1;
    while (true) {
      System.out.println("Selecione uma das opções a seguir");
      System.out.println("1 - Iniciar um novo Jogo");
      System.out.println("2 - Colocar um novo número");
      System.out.println("3 - Remover um número");
      System.out.println("4 - Visualizar jogo atual");
      System.out.println("5 - Verificar status do jogo");
      System.out.println("6 - limpar jogo");
      System.out.println("7 - Finalizar jogo");
      System.out.println("8 - Sair");

      option = scanner.nextInt();

      switch (option) {
        case 1 -> startGame(positions);
        case 2 -> inputNumber();
        case 3 -> removeNumber();
        case 4 -> showCurrentGame();
        case 5 -> showGameStatus();
        case 6 -> clearGame();
        case 7 -> finishGame();
        case 8 -> System.exit(0);
        default -> System.out.println("Opção inválida, selecione uma das opções do menu");
      }
    }
  }

  private static Map<String, String> generateSudokuBoard() {
    int[][] board = new int[BOARD_LIMIT][BOARD_LIMIT];
    fillBoard(board);
    Map<String, String> positions = new HashMap<>();
    Random random = new Random();

    for (int i = 0; i < BOARD_LIMIT; i++) {
      for (int j = 0; j < BOARD_LIMIT; j++) {
        boolean fixed = random.nextBoolean();
        positions.put(i + "," + j, board[i][j] + "," + fixed);
      }
    }

    return positions;
  }

  private static boolean fillBoard(int[][] board) {
    for (int row = 0; row < BOARD_LIMIT; row++) {
      for (int col = 0; col < BOARD_LIMIT; col++) {
        if (board[row][col] == 0) {
          for (int num = 1; num <= BOARD_LIMIT; num++) {
            if (isValid(board, row, col, num)) {
              board[row][col] = num;
              if (fillBoard(board)) {
                return true;
              }
              board[row][col] = 0;
            }
          }

          return false;
        }
      }
    }
    return true;
  }

  private static boolean isValid(int[][] board, int row, int col, int num) {
    for (int i = 0; i < BOARD_LIMIT; i++) {
      if (board[row][i] == num || board[i][col] == num) {
        return false;
      }
    }

    int boxRowStart = row - row % 3;
    int boxColStart = col - col % 3;

    for (int i = boxRowStart; i < boxRowStart + 3; i++) {
      for (int j = boxColStart; j < boxColStart + 3; j++) {
        if (board[i][j] == num) {
          return false;
        }
      }
    }

    return true;
  }

  private static void startGame(final Map<String, String> positions) {
    if (nonNull(board)) {
      System.out.println("O jogo já foi iniciado");
      return;
    }

    List<List<Space>> spaces = new ArrayList<>();
    for (int i = 0; i < BOARD_LIMIT; i++) {
      spaces.add(new ArrayList<>());
      for (int j = 0; j < BOARD_LIMIT; j++) {
        var positionConfig = positions.get("%s,%s".formatted(i, j));
        if (positionConfig != null) {
          var parts = positionConfig.split(",");
          var expected = Integer.parseInt(parts[0]);
          var fixed = Boolean.parseBoolean(parts[1]);
          var currentSpace = new Space(expected, fixed);
          spaces.get(i).add(currentSpace);
        } else {
          spaces.get(i).add(new Space(0, false));
        }
      }
    }

    board = new Board(spaces);
    System.out.println("O jogo está pronto para começar");
  }

  private static void inputNumber() {
    if (isNull(board)) {
      System.out.println("O jogo ainda não foi iniciado iniciado");
      return;
    }

    System.out.println("Informe a coluna que em que o número será inserido");
    var col = runUntilGetValidNumber(0, 8);
    System.out.println("Informe a linha que em que o número será inserido");
    var row = runUntilGetValidNumber(0, 8);
    System.out.printf("Informe o número que vai entrar na posição [%s,%s]\n", col, row);
    var value = runUntilGetValidNumber(1, 9);
    if (!board.changeValue(col, row, value)) {
      System.out.printf("A posição [%s,%s] tem um valor fixo\n", col, row);
    }
  }

  private static void removeNumber() {
    if (isNull(board)) {
      System.out.println("O jogo ainda não foi iniciado iniciado");
      return;
    }

    System.out.println("Informe a coluna que em que o número será inserido");
    var col = runUntilGetValidNumber(0, 8);
    System.out.println("Informe a linha que em que o número será inserido");
    var row = runUntilGetValidNumber(0, 8);
    if (!board.clearValue(col, row)) {
      System.out.printf("A posição [%s,%s] tem um valor fixo\n", col, row);
    }
  }

  private static void showCurrentGame() {
    if (isNull(board)) {
      System.out.println("O jogo ainda não foi iniciado iniciado");
      return;
    }

    var args = new Object[81];
    var argPos = 0;
    for (int i = 0; i < BOARD_LIMIT; i++) {
      for (var col : board.getSpaces()) {
        args[argPos++] = " " + ((isNull(col.get(i).getActual())) ? " " : col.get(i).getActual());
      }
    }
    System.out.println("Seu jogo se encontra da seguinte forma");
    System.out.printf((BOARD_TEMPLATE) + "\n", args);
  }

  private static void showGameStatus() {
    if (isNull(board)) {
      System.out.println("O jogo ainda não foi iniciado iniciado");
      return;
    }

    System.out.printf("O jogo atualmente se encontra no status %s\n", board.getStatus().getLabel());
    if (board.hasErrors()) {
      System.out.println("O jogo contém erros");
    } else {
      System.out.println("O jogo não contém erros");
    }
  }

  private static void clearGame() {
    if (isNull(board)) {
      System.out.println("O jogo ainda não foi iniciado iniciado");
      return;
    }

    System.out.println("Tem certeza que deseja limpar seu jogo e perder todo seu progresso?");
    var confirm = scanner.next();
    while (!confirm.equalsIgnoreCase("sim") && !confirm.equalsIgnoreCase("não")) {
      System.out.println("Informe 'sim' ou 'não'");
      confirm = scanner.next();
    }

    if (confirm.equalsIgnoreCase("sim")) {
      board.reset();
    }
  }

  private static void finishGame() {
    if (isNull(board)) {
      System.out.println("O jogo ainda não foi iniciado iniciado");
      return;
    }

    if (board.gameIsFinished()) {
      System.out.println("Parabéns você concluiu o jogo");
      showCurrentGame();
      board = null;
    } else if (board.hasErrors()) {
      System.out.println("Seu jogo contém, erros, verifique seu board e ajuste-o");
    } else {
      System.out.println("Você ainda precisa preenhcer algum espaço");
    }
  }

  private static int runUntilGetValidNumber(final int min, final int max) {
    var current = scanner.nextInt();
    while (current < min || current > max) {
      System.out.printf("Informe um número entre %s e %s\n", min, max);
      current = scanner.nextInt();
    }
    return current;
  }

}