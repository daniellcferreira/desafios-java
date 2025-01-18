import java.util.List;
import java.util.stream.Collectors;
import java.util.Scanner;
import java.util.ArrayList;

public class FiltroProdutos {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Quantos produtos deseja cadastrar?");
    int n = scanner.nextInt();
    scanner.nextLine();

    List<Produto> produtos = lerProdutos(scanner, n);

    System.out.println("Informe o preço mínimo:");
    double precoMin = scanner.nextDouble();
    System.out.println("Informe o preço máximo:");
    double precoMax = scanner.nextDouble();

    List<Produto> produtosFiltrados = filtrarProdutosPorPreco(produtos, precoMin, precoMax);

    if (produtosFiltrados.isEmpty()) {
      System.out.println("Nenhum produto encontrado nessa faixa de preço.");
    } else {
      System.out.println("Produtos encontrados:");
      produtosFiltrados.forEach(System.out::println);
    }

    scanner.close();
  }

  private static List<Produto> lerProdutos(Scanner scanner, int n) {
    List<Produto> produtos = new ArrayList<>();
    for (int i = 0; i < n; i++) {
      System.out.printf("Digite o nome do produto %d:%n", i + 1);
      String nome = scanner.nextLine();
      System.out.printf("Digite a categoria do produto %d:%n", i + 1);
      String categoria = scanner.nextLine();
      System.out.printf("Digite o preço do produto %d:%n", i + 1);
      double preco = scanner.nextDouble();
      scanner.nextLine(); // Limpa o buffer
      produtos.add(new Produto(nome, categoria, preco));
    }
    return produtos;
  }

  private static List<Produto> filtrarProdutosPorPreco(List<Produto> produtos, double precoMin, double precoMax) {
    return produtos.stream()
        .filter(p -> p.getPreco() >= precoMin && p.getPreco() <= precoMax)
        .collect(Collectors.toList());
  }
}

class Produto {
  private String nome;
  private String categoria;
  private double preco;

  public Produto(String nome, String categoria, double preco) {
    this.nome = nome;
    this.categoria = categoria;
    this.preco = preco;
  }

  public String getNome() {
    return nome;
  }

  public String getCategoria() {
    return categoria;
  }

  public double getPreco() {
    return preco;
  }

  @Override
  public String toString() {
    return String.format("Nome: %s - Categoria: %s - Preço: %.2f", nome, categoria, preco);
  }
}
