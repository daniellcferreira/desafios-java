import java.util.Scanner;
import java.util.regex.Pattern;

public class EndpointValidator {

  // Padrão para validar endpoints
  private static final String VALID_ENDPOINT_REGEX = "^/api/[^/]+(/[^/]+)*$"; // Padrão para validar endpoints

  // Valida um endpoint
  public static String validateEndpoint(String endpoint) {
    if (endpoint == null || endpoint.trim().isEmpty()) {
      return "Endpoint inválido: valor nulo ou vazio.";
    }
    if (Pattern.matches(VALID_ENDPOINT_REGEX, endpoint)) {
      return "Endpoint válido.";
    } else {
      return "Endpoint inválido: formato incorreto.";
    }
  }

  // Método principal
  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      System.out.println("Digite o endpoint para validação:");
      String endpoint = scanner.nextLine();
      System.out.println(validateEndpoint(endpoint));
    } catch (Exception e) {
      System.out.println("Erro ao processar entrada: " + e.getMessage());
    }
  }
}
