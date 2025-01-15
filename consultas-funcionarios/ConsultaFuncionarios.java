import java.util.*;

public class ConsultaFuncionarios {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Map<String, List<Funcionario>> departamentoFuncionarios = new HashMap<>();

    // Solicitar número de funcionários
    System.out.println("Quantos funcionários deseja cadastrar?");
    int n = scanner.nextInt();
    scanner.nextLine(); // Consumir a quebra de linha após o inteiro

    if (n <= 0) {
      System.out.println("O número de funcionários deve ser positivo.");
      scanner.close();
      return;
    }

    // Leitura dos dados dos funcionários
    System.out.println("Informe o nome, departamento e salário de cada funcionário:");
    for (int i = 0; i < n; i++) {
      System.out.print("Nome: ");
      String nome = scanner.nextLine();

      System.out.print("Departamento: ");
      String departamento = scanner.nextLine();

      System.out.print("Salário: ");
      double salario;
      try {
        salario = scanner.nextDouble();
      } catch (InputMismatchException e) {
        System.out.println("Erro: Salário deve ser um número válido.");
        scanner.close();
        return;
      }
      scanner.nextLine(); // Consumir a quebra de linha após o double

      // Adicionar funcionário ao departamento
      departamentoFuncionarios.computeIfAbsent(departamento, k -> new LinkedList<>())
          .add(new Funcionario(nome, salario));
    }

    // Consulta de funcionários por departamento
    System.out.println("Informe o departamento para consulta:");
    String departamentoConsulta = scanner.nextLine();

    List<Funcionario> funcionarios = departamentoFuncionarios.getOrDefault(departamentoConsulta, new LinkedList<>());

    if (funcionarios.isEmpty()) {
      System.out.println("Nenhum funcionário encontrado no departamento: " + departamentoConsulta);
    } else {
      System.out.println("Funcionários do departamento " + departamentoConsulta + ":");
      for (Funcionario funcionario : funcionarios) {
        System.out.printf("Nome: %s - Salário: %.2f\n", funcionario.nome, funcionario.salario);
      }
    }

    scanner.close();
  }
}

// Classe para representar um funcionário
class Funcionario {
  String nome;
  double salario;

  Funcionario(String nome, double salario) {
    this.nome = nome;
    this.salario = salario;
  }
}
