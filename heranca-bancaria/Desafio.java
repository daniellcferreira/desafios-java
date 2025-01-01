import java.text.DecimalFormat;
import java.util.Scanner;

public class Desafio {

  public static void main(String[] args) {
    // Criação do Scanner para leitura de entrada do usuário
    Scanner scanner = new Scanner(System.in);

    // Solicitando informações do usuário para inicializar a conta poupança
    System.out.println("Digite o titular:");
    String titular = scanner.nextLine();

    System.out.println("Digite o número da conta:");
    int numeroConta = scanner.nextInt();

    System.out.println("Digite o saldo inicial:");
    double saldo = scanner.nextDouble();

    System.out.println("Digite a taxa de juros:");
    double taxaJuros = scanner.nextDouble();

    // Validação básica para garantir que os valores sejam válidos
    if (saldo < 0 || taxaJuros < 0) {
      System.out.println("Saldo e taxa de juros devem ser valores não negativos.");
      scanner.close(); // Fechando o Scanner antes de encerrar o programa
      return;
    }

    // Criação da instância da classe ContaPoupanca
    ContaPoupanca contaPoupanca = new ContaPoupanca(numeroConta, titular, saldo, taxaJuros);

    // Exibição das informações da conta poupança
    System.out.println("\nConta Poupança:");
    contaPoupanca.exibirInformacoes();

    // Encerrando o recurso Scanner
    scanner.close();
  }
}

class ContaBancaria {
  // Atributos protegidos ou privados para promover encapsulamento
  private int numero;
  private String titular;
  private double saldo;

  // Construtor para inicializar os atributos da conta bancária
  public ContaBancaria(int numero, String titular, double saldo) {
    this.numero = numero;
    this.titular = titular;
    this.saldo = saldo;
  }

  // Método utilitário para formatar valores monetários
  protected String formatarValor(double valor) {
    DecimalFormat decimalFormat = new DecimalFormat("#.0");
    return decimalFormat.format(valor);
  }

  // Método para exibir informações básicas da conta
  public void exibirInformacoes() {
    System.out.println("Titular: " + titular); // Exibe o nome do titular
    System.out.println("Número da Conta: " + numero); // Exibe o número da conta
    System.out.println("Saldo: R$ " + formatarValor(saldo)); // Exibe o saldo formatado
  }

  // Métodos getters para acessar atributos privados de forma controlada
  public int getNumero() {
    return numero;
  }

  public String getTitular() {
    return titular;
  }

  public double getSaldo() {
    return saldo;
  }
}

class ContaPoupanca extends ContaBancaria {
  // Atributo adicional específico da conta poupança
  private double taxaJuros;

  // Construtor da ContaPoupanca que reutiliza o construtor da superclasse
  public ContaPoupanca(int numero, String titular, double saldo, double taxaJuros) {
    super(numero, titular, saldo); // Chamada ao construtor da superclasse
    this.taxaJuros = taxaJuros; // Inicializa o atributo específico
  }

  // Sobrescrita do método exibirInformacoes para incluir a taxa de juros
  @Override
  public void exibirInformacoes() {
    super.exibirInformacoes(); // Reutiliza a lógica da superclasse
    System.out.println("Taxa de Juros: " + formatarValor(taxaJuros) + "%"); // Exibe a taxa de juros
  }
}
