import java.util.Scanner;

public class VerificadorElegibilidadeConta {

  public static void main(String[] args) {
    Scanner entradaUsuario = new Scanner(System.in); // Cria um objeto Scanner para entrada de dados

    System.out.print("Por favor, insira sua idade: "); // Orienta o usuário
    if (entradaUsuario.hasNextInt()) { // Verifica se a entrada é um número inteiro
      int idade = entradaUsuario.nextInt(); // Lê a idade do usuário

      // Verifica se a idade é maior ou igual a 18
      if (idade >= 18) {
        System.out.println("Você é elegível para abrir uma conta.");
      } else {
        System.out.println("Você não é elegível para abrir uma conta.");
      }
    } else {
      System.out.println("Entrada inválida. Por favor, insira um número inteiro.");
    }

    entradaUsuario.close(); // Fecha o objeto Scanner
  }
}
