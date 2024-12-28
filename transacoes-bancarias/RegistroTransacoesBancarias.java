import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RegistroTransacoesBancarias {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // Lê o saldo inicial
    System.out.println("Bem-vindo ao registro de transações bancárias.");
    BigDecimal saldo = lerSaldoInicial(scanner);

    // Lê a quantidade de transações
    int quantidadeTransacoes = lerQuantidadeTransacoes(scanner);

    // Lista para armazenar as transações
    List<String> transacoes = new ArrayList<>();

    // Processa as transações
    for (int i = 1; i <= quantidadeTransacoes; i++) {
      System.out.println("\nTransação " + i + " de " + quantidadeTransacoes + ":");
      System.out.println("Digite 'D' para depósito ou 'S' para saque:");
      char tipoTransacao = scanner.next().toUpperCase().charAt(0);

      System.out.println("Digite o valor da transação:");
      BigDecimal valorTransacao = scanner.nextBigDecimal();

      if (tipoTransacao == 'D') {
        if (valorTransacao.compareTo(BigDecimal.ZERO) <= 0) {
          System.out.println("Erro: O valor do depósito deve ser maior que zero.");
          i--; // Repetir a transação
          continue;
        }
        saldo = saldo.add(valorTransacao);
        transacoes.add("Depósito de " + valorTransacao);
        System.out.println("Depósito realizado com sucesso!");
      } else if (tipoTransacao == 'S') {
        if (valorTransacao.compareTo(BigDecimal.ZERO) <= 0) {
          System.out.println("Erro: O valor do saque deve ser maior que zero.");
          i--; // Repetir a transação
          continue;
        }
        if (saldo.compareTo(valorTransacao) < 0) {
          System.out.println("Erro: Saldo insuficiente para realizar o saque.");
          i--; // Repetir a transação
          continue;
        }
        saldo = saldo.subtract(valorTransacao);
        transacoes.add("Saque de " + valorTransacao);
        System.out.println("Saque realizado com sucesso!");
      } else {
        System.out.println("Erro: Tipo de transação inválido. Utilize 'D' para depósito ou 'S' para saque.");
        i--; // Repetir a transação
      }
    }

    // Exibe o saldo final e as transações
    exibirResumo(saldo, transacoes);

    scanner.close();
  }

  private static BigDecimal lerSaldoInicial(Scanner scanner) {
    System.out.println("Digite o saldo inicial da conta:");
    return scanner.nextBigDecimal();
  }

  private static int lerQuantidadeTransacoes(Scanner scanner) {
    System.out.println("Digite a quantidade total de transações que deseja registrar:");
    return scanner.nextInt();
  }

  private static void exibirResumo(BigDecimal saldo, List<String> transacoes) {
    System.out.println("\nResumo das transações:");
    System.out.println("Saldo final: " + saldo);
    System.out.println("Lista de transações:");
    for (int i = 0; i < transacoes.size(); i++) {
      System.out.println((i + 1) + ". " + transacoes.get(i));
    }
  }
}
