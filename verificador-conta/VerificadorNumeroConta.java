import java.util.Scanner;

public class VerificadorNumeroConta {

  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) { // Garante o fechamento automático do Scanner.
      System.out.println("Bem-vindo ao Verificador de Número de Conta!");

      boolean numeroValido = false; // Flag para controle do loop.

      // Continua solicitando o número até que uma entrada válida seja fornecida.
      while (!numeroValido) {
        System.out.print("Por favor, digite o número da conta (8 dígitos): ");
        String conta = scanner.nextLine(); // Lê a entrada do usuário.

        try {
          verificarNumeroConta(conta); // Valida o número da conta.
          System.out.println("Número de conta válido."); // Mensagem de sucesso.
          numeroValido = true; // Sai do loop, pois o número é válido.
        } catch (IllegalArgumentException e) {
          // Exibe a mensagem de erro e solicita novamente a entrada.
          System.err.println(e.getMessage());
        }
      }
    }
  }

  private static void verificarNumeroConta(String numeroConta) {
    // Verifica se o número de conta é nulo ou vazio.
    if (numeroConta == null || numeroConta.isEmpty()) {
      throw new IllegalArgumentException("Erro: Número de conta não pode estar vazio. Tente novamente.");
    }

    // Verifica se o número de conta contém exatamente 8 dígitos numéricos.
    if (!numeroConta.matches("\\d{8}")) {
      throw new IllegalArgumentException("Erro: Número de conta inválido. Deve conter exatamente 8 dígitos numéricos.");
    }
  }
}
