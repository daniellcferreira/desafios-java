import java.util.Scanner;

public class MainContaBancaria {

  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {

      // Criar uma nova conta bancária com o saldo inicial
      double saldoInicial = lerEntradaPositiva(scanner, "Digite o saldo inicial: ");
      ContaBancaria conta = new ContaBancaria(saldoInicial);

      // Lê o valor do depósito e aciona o método "depositar"
      double valorDeposito = lerEntradaPositiva(scanner, "Digite o valor do depósito: ");
      conta.depositar(valorDeposito);

      // Lê o valor do saque e aciona o método "sacar"
      double valorSaque = lerEntradaPositiva(scanner, "Digite o valor do saque: ");
      conta.sacar(valorSaque);
    }
  }

  // Método para ler apenas valores positivos
  private static double lerEntradaPositiva(Scanner scanner, String mensagem) {
    double valor;
    while (true) {
      System.out.print(mensagem);
      if (scanner.hasNextDouble()) {
        valor = scanner.nextDouble();
        if (valor >= 0) {
          break;
        } else {
          System.out.println("Valor inválido! Insira um número positivo.");
        }
      } else {
        System.out.println("Entrada inválida! Insira um número.");
        scanner.next(); // Limpa a entrada inválida
      }
    }
    return valor;
  }
}

class ContaBancaria {
  private double saldo;

  public ContaBancaria(double saldoInicial) {
    this.saldo = saldoInicial;
  }

  public void depositar(double valor) {
    saldo += valor;
    System.out.printf("Depósito de %.2f realizado com sucesso.%n", valor);
    imprimirSaldo();
  }

  public void sacar(double valor) {
    if (valor <= saldo) {
      saldo -= valor;
      System.out.printf("Saque de %.2f realizado com sucesso.%n", valor);
    } else {
      System.out.println("Saldo insuficiente. Saque não realizado.");
    }
    imprimirSaldo();
  }

  private void imprimirSaldo() {
    System.out.printf("Saldo atual: %.2f%n", this.saldo);
  }
}
