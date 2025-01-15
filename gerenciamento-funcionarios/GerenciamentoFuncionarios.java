import java.util.*;

public class GerenciamentoFuncionarios {

  // Classe estática que representa um funcionário
  static class Funcionario {
    int id; // Identificador único do funcionário
    String nome; // Nome do funcionário
    String cargo; // Cargo do funcionário

    // Construtor para inicializar os atributos do funcionário
    Funcionario(int id, String nome, String cargo) {
      this.id = id;
      this.nome = nome;
      this.cargo = cargo;
    }

    // Método para formatar a saída do funcionário
    @Override
    public String toString() {
      return id + ": " + nome + " - " + cargo;
    }
  }

  public static void main(String[] args) {
    // Scanner para capturar a entrada do usuário
    Scanner scanner = new Scanner(System.in);
    List<Funcionario> funcionarios = new ArrayList<>();

    // Solicitar a quantidade de funcionários a serem cadastrados
    System.out.println("Quantos funcionários deseja cadastrar?");
    int n = scanner.nextInt();
    scanner.nextLine(); // Limpar a quebra de linha pendente

    // Validar se o número de funcionários é positivo
    if (n <= 0) {
      System.out.println("O número de funcionários deve ser positivo.");
      scanner.close();
      return; // Encerrar o programa caso a entrada seja inválida
    }

    // Solicitar os dados de cada funcionário
    System.out.println("Digite o nome e o cargo de cada funcionário:");
    for (int i = 0; i < n; i++) {
      System.out.print("Nome do funcionário " + (i + 1) + ": ");
      String nome = scanner.nextLine(); // Captura o nome do funcionário

      System.out.print("Cargo do funcionário " + (i + 1) + ": ");
      String cargo = scanner.nextLine(); // Captura o cargo do funcionário

      // Criar e adicionar o funcionário à lista
      Funcionario funcionario = new Funcionario(i + 1, nome, cargo);
      funcionarios.add(funcionario);
    }

    // Ordenar a lista de funcionários por ID (não necessário aqui, pois IDs já são
    // sequenciais)
    funcionarios.sort(Comparator.comparingInt(f -> f.id));

    // Exibir os funcionários cadastrados
    System.out.println("\nFuncionários cadastrados:");
    for (Funcionario f : funcionarios) {
      System.out.println(f);
    }

    // Fechar o Scanner para liberar recursos
    scanner.close();
  }
}
