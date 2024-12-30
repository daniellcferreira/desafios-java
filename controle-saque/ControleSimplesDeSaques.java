import java.util.Scanner;

public class ControleSimplesDeSaques {

  public static void main(String[] args) {
    Scanner entradaUsuario = new Scanner(System.in); // Cria um objeto Scanner

    System.out.print("Informe o limite diário: ");
    if (entradaUsuario.hasNextDouble()) {
      double limiteDiario = entradaUsuario.nextDouble(); // Lê o limite diário
      double totalSacado = 0; // Inicializa o total sacado

      // Loop para realizar saques
      while (totalSacado < limiteDiario) {
        System.out.print("Informe o valor do saque (ou 0 para encerrar): ");
        if (entradaUsuario.hasNextDouble()) {
          double saque = entradaUsuario.nextDouble(); // Lê o valor do saque

          if (saque == 0) { // Se o saque for 0, encerra o loop
            System.out.println("Transação encerrada.");
            break;
          } else if (saque < 0) { // Verifica se o saque é negativo
            System.out.println("Valor inválido. Insira um valor positivo.");
          } else if (totalSacado + saque > limiteDiario) { // Verifica se excede o limite diário
            System.out.println(
                "Saque excede o limite diário disponível. Limite restante: R$ " + (limiteDiario - totalSacado));
          } else { // Realiza o saque válido
            totalSacado += saque;
            System.out.println(
                "Saque de R$ " + saque + " realizado com sucesso. Limite restante: R$ " + (limiteDiario - totalSacado));
          }
        } else {
          System.out.println("Entrada inválida. Por favor, insira um número.");
          entradaUsuario.next(); // Limpa a entrada inválida
        }
      }
    } else {
      System.out.println("Entrada inválida para o limite diário. Por favor, insira um número.");
    }

    entradaUsuario.close(); // Fecha o objeto Scanner
  }
}
