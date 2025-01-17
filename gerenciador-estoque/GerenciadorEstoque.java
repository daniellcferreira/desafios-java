import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class GerenciadorEstoque {

  private static final Map<String, Integer> produtosEstoque = new HashMap<>();

  static {
    produtosEstoque.put("Switch", 10);
    produtosEstoque.put("Roteador", 20);
    produtosEstoque.put("Modem", 30);
    produtosEstoque.put("Cabo de rede", 40);
    produtosEstoque.put("Patch panel", 50);
    produtosEstoque.put("Conector RJ45", 60);
    produtosEstoque.put("Servidor", 70);
    produtosEstoque.put("Mouse", 10);
    produtosEstoque.put("Teclado", 20);
  }

  public static String consultarProduto(String nomeProduto) {
    if (nomeProduto == null || nomeProduto.isBlank()) {
      return "Por favor, insira um nome válido para o produto.";
    }

    String nomeFormatado = nomeProduto.trim();
    if (produtosEstoque.containsKey(nomeFormatado)) {
      int quantidade = produtosEstoque.get(nomeFormatado);
      return quantidade > 0
          ? "Produto disponível em estoque: " + quantidade
          : "Produto indisponível em estoque";
    } else {
      return "Produto não encontrado.";
    }
  }

  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      while (true) {
        System.out.println("Digite o nome do produto para consulta (ou 'sair' para encerrar):");
        String nomeProduto = scanner.nextLine().trim();

        if (nomeProduto.equalsIgnoreCase("sair")) {
          System.out.println("Encerrando o programa. Até a próxima!");
          break;
        }

        String resultado = consultarProduto(nomeProduto);
        System.out.println(resultado);
      }
    }
  }
}
