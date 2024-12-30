import java.util.Scanner;

public class VerificacaoChequeEspecial {

  public static void main(String[] args) {
    Scanner entradaUsuario = new Scanner(System.in); // Instancia o Scanner para entrada de dados

    final double LIMITE_CHEQUE_ESPECIAL = 500; // Define o limite do cheque especial como constante

    System.out.print("Informe o saldo da conta: ");
    if (entradaUsuario.hasNextDouble()) {
      double saldo = entradaUsuario.nextDouble(); // Lê o saldo da conta

      System.out.print("Informe o valor do saque: ");
      if (entradaUsuario.hasNextDouble()) {
        double saque = entradaUsuario.nextDouble(); // Lê o valor do saque

        // Verifica se o saque é menor que o saldo da conta
        if (saque <= saldo) {
          System.out.println("Saque efetuado com sucesso!");
        } else if (saque <= saldo + LIMITE_CHEQUE_ESPECIAL) {
          System.out.println("Saque efetuado com sucesso! (Usando cheque especial)");
        } else {
          System.out.println("Saldo insuficiente! Limite do cheque especial excedido.");
        }
      } else {
        System.out.println("Entrada inválida para o valor do saque. Por favor, insira um número.");
      }
    } else {
      System.out.println("Entrada inválida para o saldo. Por favor, insira um número.");
    }

    entradaUsuario.close(); // Fecha o Scanner
  }
}
