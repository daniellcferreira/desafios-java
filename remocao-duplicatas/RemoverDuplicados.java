import java.util.*;

public class RemoverDuplicados {
  // Remove duplicados preservando a ordem de inserção
  public static List<String> removerDuplicados(List<String> produtos) {
    Set<String> vistos = new HashSet<>();
    List<String> resultado = new ArrayList<>();

    for (String produto : produtos) {
      String produtoNormalizado = produto.toLowerCase(); // Normaliza para ignorar o caso
      if (vistos.add(produtoNormalizado)) { // Adiciona ao conjunto e verifica duplicidade
        resultado.add(produto);
      }
    }
    return resultado;
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // Solicita o número de produtos
    System.out.println("Quantos produtos deseja inserir?");
    int n = scanner.nextInt();
    scanner.nextLine(); // Consome a quebra de linha

    if (n <= 0) {
      System.out.println("O número de produtos deve ser positivo.");
      return;
    }

    List<String> produtos = new ArrayList<>();

    // Solicita os nomes dos produtos
    System.out.println("Insira os nomes dos produtos:");
    for (int i = 0; i < n; i++) {
      String produto = scanner.nextLine();
      produtos.add(produto);
    }

    // Remove duplicados e exibe os resultados
    List<String> produtosUnicos = removerDuplicados(produtos);

    System.out.println("Produtos únicos:");
    produtosUnicos.forEach(System.out::println);

    scanner.close();
  }
}
