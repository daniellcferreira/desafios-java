import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HttpMethodCounter {
  public static String findMostFrequentMethod(String input) {
    if (input == null || input.isBlank()) {
      return "Entrada inválida. Forneça uma lista de métodos HTTP separados por vírgula.";
    }

    String[] methods = input.split(",");
    Map<String, Integer> methodCounts = new HashMap<>();

    // Contar a ocorrência de cada método HTTP, normalizando para maiúsculas
    for (String method : methods) {
      method = method.trim().toUpperCase(); // Remove espaços e converte para maiúsculas
      methodCounts.compute(method, (k, v) -> (v == null) ? 1 : v + 1);
    }

    // Encontrar o método com a maior contagem
    String mostFrequentMethod = null;
    int maxCount = 0;
    for (Map.Entry<String, Integer> entry : methodCounts.entrySet()) {
      if (entry.getValue() > maxCount) {
        mostFrequentMethod = entry.getKey();
        maxCount = entry.getValue();
      }
    }

    if (mostFrequentMethod == null) {
      return "Nenhum método HTTP encontrado na entrada.";
    }

    // Mapa de descrições para métodos HTTP
    Map<String, String> descriptions = Map.of(
        "GET", "O GET solicita a representação de um recurso.",
        "POST", "O POST envia dados para processamento.",
        "PUT", "O PUT atualiza todos os dados de um recurso.",
        "DELETE", "O DELETE remove um recurso específico.");

    String description = descriptions.getOrDefault(mostFrequentMethod, "Método não reconhecido.");
    return mostFrequentMethod + ": " + maxCount + " - " + description;
  }

  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      System.out.println("Digite os métodos HTTP separados por vírgula:");
      String input = scanner.nextLine();
      String output = findMostFrequentMethod(input);
      System.out.println(output);
    }
  }
}
