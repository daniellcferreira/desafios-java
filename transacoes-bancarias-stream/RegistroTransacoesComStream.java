import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RegistroTransacoesComStream {

  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) { // try-with-resources para fechar o Scanner automaticamente
      System.out.print("Digite o saldo inicial da conta: ");
      BigDecimal saldo = scanner.nextBigDecimal(); // Lê o saldo inicial da conta

      System.out.print("Digite a quantidade de transações a serem registradas: ");
      int quantidadeTransacoes = scanner.nextInt(); // Lê a quantidade de transações

      List<Transacao> transacoes = new ArrayList<>(); // Lista para armazenar transações

      for (int i = 1; i <= quantidadeTransacoes; i++) {
        System.out.printf("Transação %d - Digite o tipo de transação (D para depósito, S para saque): ", i);
        char tipoTransacao = scanner.next().toUpperCase().charAt(0);

        System.out.printf("Transação %d - Digite o valor da transação: ", i);
        BigDecimal valorTransacao = scanner.nextBigDecimal();

        if (tipoTransacao != 'D' && tipoTransacao != 'S') {
          System.out.println("Tipo de transação inválido. Transação ignorada.");
          continue;
        }

        if (valorTransacao.compareTo(BigDecimal.ZERO) <= 0) {
          System.out.println("O valor da transação deve ser positivo. Transação ignorada.");
          continue;
        }

        // Cria e adiciona a transação à lista
        Transacao transacao = new Transacao(tipoTransacao, valorTransacao);
        transacoes.add(transacao);

        // Atualiza o saldo com base no tipo de transação
        switch (tipoTransacao) {
          case 'D' -> saldo = saldo.add(valorTransacao);
          case 'S' -> saldo = saldo.subtract(valorTransacao);
        }
      }

      // Exibe o saldo final e as transações realizadas
      System.out.printf("Saldo final: R$ %.2f%n", saldo);
      System.out.println("Transações registradas:");
      transacoes.stream()
          .map(transacao -> transacao.getTipo() + " de R$ " + transacao.getValor().setScale(2))
          .forEach(System.out::println);
    }
  }
}

class Transacao {
  private final char tipo;
  private final BigDecimal valor;

  public Transacao(char tipo, BigDecimal valor) {
    this.tipo = tipo;
    this.valor = valor;
  }

  public char getTipo() {
    return tipo;
  }

  public BigDecimal getValor() {
    return valor;
  }
}
