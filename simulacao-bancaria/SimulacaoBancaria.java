import java.util.Scanner;

/**
 * Classe SimulacaoBancaria
 * Simula operações bancárias básicas, como depósito, saque, consulta de saldo e
 * saída.
 * O programa mantém um loop até que o usuário escolha sair.
 */
public class SimulacaoBancaria {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in); // Scanner para capturar as entradas do usuário
    double saldo = 0; // Variável para armazenar o saldo da conta
    boolean chave = true; // Controle para manter o programa em execução

    // Loop principal do programa
    while (chave) {
      // Exibe o menu de opções para o usuário
      System.out.println("\nEscolha uma opção:");
      System.out.println("1 - Depositar");
      System.out.println("2 - Sacar");
      System.out.println("3 - Ver Saldo");
      System.out.println("0 - Sair");
      System.out.print("Opção: ");

      // Valida a entrada para garantir que seja um número inteiro
      if (!scanner.hasNextInt()) {
        System.out.println("Entrada inválida. Digite um número.");
        scanner.next(); // Descarta a entrada inválida
        continue; // Volta ao início do loop
      }

      int opcao = scanner.nextInt(); // Lê a opção escolhida pelo usuário

      // Realiza a operação correspondente à opção escolhida
      switch (opcao) {
        case 1: // Depósito
          System.out.print("Digite o valor para depósito: ");
          if (scanner.hasNextDouble()) { // Valida se a entrada é um número válido
            double deposito = scanner.nextDouble();
            if (deposito > 0) { // Verifica se o valor é positivo
              saldo += deposito;
              System.out.println("Depósito realizado com sucesso!");
            } else {
              System.out.println("O valor deve ser positivo.");
            }
          } else {
            System.out.println("Entrada inválida.");
            scanner.next(); // Descarta a entrada inválida
          }
          break;

        case 2: // Saque
          System.out.print("Digite o valor para saque: ");
          if (scanner.hasNextDouble()) { // Valida se a entrada é um número válido
            double saque = scanner.nextDouble();
            if (saque > saldo) { // Verifica se há saldo suficiente
              System.out.println("Saldo insuficiente.");
            } else if (saque > 0) { // Verifica se o valor é positivo
              saldo -= saque;
              System.out.println("Saque realizado com sucesso!");
            } else {
              System.out.println("O valor deve ser positivo.");
            }
          } else {
            System.out.println("Entrada inválida.");
            scanner.next(); // Descarta a entrada inválida
          }
          break;

        case 3: // Consulta de saldo
          System.out.println("Saldo atual: " + saldo);
          break;

        case 0: // Sair
          chave = false; // Sai do loop principal
          break;

        default: // Opção inválida
          System.out.println("Opção inválida. Tente novamente.");
      }
    }

    // Mensagem final quando o programa for encerrado
    System.out.println("Programa encerrado.");
    scanner.close(); // Fecha o Scanner para liberar recursos
  }
}
