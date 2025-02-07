import java.util.Scanner;

public class Main {

  private static Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) {

    int option;
    GeometricForm geometricForm = null;

    while (true) {
      System.out.println("Escolha a forma geométrica para calcular a área:");
      System.out.println("1 - Quadrado");
      System.out.println("2 - Retângulo");
      System.out.println("3 - Círculo");
      System.out.println("4 - Sair");
      option = scanner.nextInt();
      switch (option) {
        case 1 -> geometricForm = createSquare();
        case 2 -> geometricForm = createRectangle();
        case 3 -> geometricForm = createCircle();
        case 4 -> System.exit(0);
        default -> System.out.println("Opção inválida.");
      }
      System.out.println("Área: " + geometricForm.getArea());
    }
  }

  private static GeometricForm createSquare() {
    System.out.println("Informe os tamanhos dos lados:");
    var side = scanner.nextDouble();
    return new Square(side);
  }

  private static GeometricForm createRectangle() {
    System.out.println("Informe a base:");
    var base = scanner.nextDouble();
    System.out.println("Informe a altura:");
    var height = scanner.nextDouble();
    return new Rectangle(height, base);
  }

  private static GeometricForm createCircle() {
    System.out.println("Informe o raio:");
    var radius = scanner.nextDouble();
    return new Circle(radius);
  }

}
