import java.util.InputMismatchException;
import java.util.Scanner;

abstract class Cofre {

  private final String tipo; // Tipo de cofre
  private final String metodoAbertura; // Método de abertura do cofre

  public Cofre(String tipo, String metodoAbertura) { // Construtor da classe
    this.tipo = tipo;
    this.metodoAbertura = metodoAbertura;
  }

  public String getTipo() {
    return tipo;
  }

  public String getMetodoAbertura() {
    return metodoAbertura;
  }

  public void imprimirInformacoes() { // Método para imprimir informações do cofre
    System.out.println("Tipo: " + tipo);
    System.out.println("Método de abertura: " + metodoAbertura);
  }
}

class CofreDigital extends Cofre {

  private final int senha; // Senha do cofre

  public CofreDigital(int senha) { // Construtor da classe
    super("Cofre Digital", "Senha");
    this.senha = senha;
  }

  public boolean validarSenha(int confirmacaoSenha) { // Método para validar a senha
    return confirmacaoSenha == senha;
  }
}

class CofreFisico extends Cofre {

  public CofreFisico() { // Construtor da classe
    super("Cofre Físico", "Chave");
  }
}

public class Desafio {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in); // Instanciando o objeto scanner

    try {
      System.out.println("Digite o tipo de cofre (digital/fisico):");
      String tipoCofre = scanner.nextLine().trim(); // Lendo o tipo de cofre

      if (tipoCofre.equalsIgnoreCase("digital")) {
        System.out.println("Digite a senha do cofre:");
        int senha = scanner.nextInt(); // Lendo a senha do cofre
        CofreDigital cofreDigital = new CofreDigital(senha); // Instanciando o objeto cofreDigital
        cofreDigital.imprimirInformacoes(); // Imprimindo informações do cofre

        System.out.println("Digite a senha para abrir o cofre:");
        int confirmacaoSenha = scanner.nextInt(); // Lendo a confirmação da senha

        if (cofreDigital.validarSenha(confirmacaoSenha)) {
          System.out.println("Senha correta, cofre aberto!");
        } else {
          System.out.println("Senha incorreta!");
        }
      } else if (tipoCofre.equalsIgnoreCase("fisico")) {
        CofreFisico cofreFisico = new CofreFisico(); // Instanciando o objeto cofreFisico
        cofreFisico.imprimirInformacoes(); // Imprimindo informações do cofre
      } else {
        System.out.println("Tipo de cofre inválido");
      }
    } catch (InputMismatchException e) {
      System.out.println("Erro: entrada inválida. Por favor, tente novamente.");
    } finally {
      scanner.close(); // Fechando o objeto scanner
    }
  }
}
