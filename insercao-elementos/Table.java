import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Classe Table que representa uma tabela com IDs e nomes.
 * Permite inserir, atualizar, remover e exibir as entradas armazenadas.
 */
public class Table {

  // Mapa para armazenar os dados da tabela: chave (ID) e valor (nome)
  private Map<Integer, String> table;

  // Construtor que inicializa a tabela como um HashMap vazio.
  public Table() {
    this.table = new HashMap<>();
  }

  // Insere um novo elemento na tabela, validando se o ID já existe.
  // O identificador único da entrada.
  // O nome associado ao ID.
  public void insert(int id, String name) {
    if (table.containsKey(id)) {
      System.out.println("ID já existe! Use a função de atualização.");
    } else {
      table.put(id, name);
      System.out.println("Inserção realizada com sucesso.");
    }
  }

  // Atualiza um elemento existente na tabela.
  // O identificador único da entrada a ser atualizada.
  // O novo nome associado ao ID.
  public void update(int id, String name) {
    if (table.containsKey(id)) {
      table.put(id, name);
      System.out.println("Atualização realizada com sucesso.");
    } else {
      System.out.println("ID não encontrado! Use a função de inserção.");
    }
  }

  // Remove um elemento da tabela pelo ID.
  // O identificador único da entrada a ser removida.
  public void delete(int id) {
    if (table.containsKey(id)) {
      table.remove(id);
      System.out.println("Remoção realizada com sucesso.");
    } else {
      System.out.println("ID não encontrado! Nada a remover.");
    }
  }

  // Exibe todos os elementos da tabela no formato "ID: Nome".
  public void display() {
    if (table.isEmpty()) {
      System.out.println("A tabela está vazia.");
    } else {
      for (Map.Entry<Integer, String> entry : table.entrySet()) {
        System.out.println("ID: " + entry.getKey() + ", Nome: " + entry.getValue());
      }
    }
  }

  // Método principal que interage com o usuário para gerenciar a tabela.
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Table table = new Table();

    while (true) {
      System.out.println("\nEscolha uma opção:");
      System.out.println("1 - Inserir");
      System.out.println("2 - Atualizar");
      System.out.println("3 - Remover");
      System.out.println("4 - Exibir");
      System.out.println("5 - Sair");
      System.out.print("Opção: ");

      int option;
      try {
        option = scanner.nextInt();
        scanner.nextLine(); // Consome a quebra de linha
      } catch (Exception e) {
        System.out.println("Entrada inválida! Por favor, insira um número.");
        scanner.nextLine(); // Limpa a entrada
        continue;
      }

      switch (option) {
        case 1:
          System.out.print("Digite o ID: ");
          int insertId = scanner.nextInt();
          scanner.nextLine(); // Consome a quebra de linha
          System.out.print("Digite o Nome: ");
          String insertName = scanner.nextLine();
          table.insert(insertId, insertName);
          break;

        case 2:
          System.out.print("Digite o ID para atualizar: ");
          int updateId = scanner.nextInt();
          scanner.nextLine(); // Consome a quebra de linha
          System.out.print("Digite o novo Nome: ");
          String updateName = scanner.nextLine();
          table.update(updateId, updateName);
          break;

        case 3:
          System.out.print("Digite o ID para remover: ");
          int deleteId = scanner.nextInt();
          scanner.nextLine(); // Consome a quebra de linha
          table.delete(deleteId);
          break;

        case 4:
          table.display();
          break;

        case 5:
          System.out.println("Encerrando o programa. Até mais!");
          scanner.close();
          return;

        default:
          System.out.println("Opção inválida! Tente novamente.");
      }
    }
  }
}
