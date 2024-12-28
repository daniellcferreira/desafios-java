import java.util.Scanner;

/**
 * Programa de Simulação Bancária
 * Este programa permite ao usuário realizar operações bancárias simples, como
 * depósitos, saques e consulta ao saldo.
 * O usuário pode interagir com o programa até optar por encerrar a execução.
 */
public class SimulacaoBancaria {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in); // Scanner para capturar as entradas do usuário
    double saldo = 0; // Variável para armazenar o saldo da conta
    boolean chave = true; // Controle do loop principal

    // Loop infinito para manter o programa em execução até que o usuário decida
    // sair
    while (chave) {
      // Exibe as opções do menu
      System.out.println("\nEscolha uma opção:");
      System.out.println("1 - Depósito");
      System.out.println("2 - Saque");
      System.out.println("3 - Consultar saldo");
      System.out.println("0 - Sair");

      // Captura a opção escolhida pelo usuário
      int opcao = scanner.nextInt();

      // Executa a operação com base na opção escolhida
      switch (opcao) {
        case 1:
          // Operação de depósito
          System.out.println("Digite o valor do depósito:");
          double deposito = scanner.nextDouble();
          saldo += deposito; // Adiciona o valor ao saldo
          System.out.println("Depósito realizado com sucesso. Saldo atual: " + saldo);
          break;
        case 2:
          // Operação de saque
          System.out.println("Digite o valor do saque:");
          double saque = scanner.nextDouble();
          if (saque > saldo) {
            // Caso o saldo seja insuficiente
            System.out.println("Saldo insuficiente. Operação não realizada.");
          } else {
            saldo -= saque; // Subtrai o valor do saldo
            System.out.println("Saque realizado com sucesso. Saldo atual: " + saldo);
          }
          break;
        case 3:
          // Consulta ao saldo atual
          System.out.println("Saldo atual: " + saldo);
          break;
        case 0:
          // Encerra o programa
          System.out.println("Programa encerrado.");
          chave = false;
          break;
        default:
          // Opção inválida
          System.out.println("Opção inválida. Tente novamente.");
      }
    }
    scanner.close(); // Fecha o scanner para evitar vazamentos de recursos
  }
}
