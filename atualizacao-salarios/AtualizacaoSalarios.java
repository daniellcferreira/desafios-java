import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AtualizacaoSalarios {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Digite o número de funcionários: ");
    int n = scanner.nextInt();
    scanner.nextLine(); // Consumir a quebra de linha após o inteiro

    List<Funcionario> funcionarios = new ArrayList<>();

    // Leitura dos dados dos funcionários
    for (int i = 0; i < n; i++) {
      System.out.printf("Digite os dados do funcionário %d:%n", i + 1);
      System.out.print("Nome: ");
      String nome = scanner.nextLine();

      System.out.print("Departamento: ");
      String departamento = scanner.nextLine();

      System.out.print("Salário: ");
      while (!scanner.hasNextDouble()) {
        System.out.print("Entrada inválida. Digite um valor numérico para o salário: ");
        scanner.next();
      }
      double salario = scanner.nextDouble();
      scanner.nextLine(); // Consumir a quebra de linha após o double

      funcionarios.add(new Funcionario(nome, departamento, salario));
    }

    System.out.print("Digite a porcentagem de aumento salarial: ");
    while (!scanner.hasNextDouble()) {
      System.out.print("Entrada inválida. Digite um valor numérico para a porcentagem: ");
      scanner.next();
    }
    double aumento = scanner.nextDouble();

    // Atualização e impressão dos salários
    System.out.println("\nAtualização dos salários:");
    for (Funcionario f : funcionarios) {
      double novoSalario = f.calcularNovoSalario(aumento);
      System.out.printf("Nome: %s - Departamento: %s - Novo Salário: %.2f%n", f.getNome(), f.getDepartamento(),
          novoSalario);
    }

    scanner.close();
  }
}

class Funcionario {
  private String nome;
  private String departamento;
  private double salario;

  public Funcionario(String nome, String departamento, double salario) {
    this.nome = nome;
    this.departamento = departamento;
    this.salario = salario;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getDepartamento() {
    return departamento;
  }

  public void setDepartamento(String departamento) {
    this.departamento = departamento;
  }

  public double getSalario() {
    return salario;
  }

  public void setSalario(double salario) {
    this.salario = salario;
  }

  public double calcularNovoSalario(double aumentoPercentual) {
    return this.salario * (1 + aumentoPercentual / 100);
  }
}
