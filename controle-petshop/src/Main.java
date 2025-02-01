import java.util.Scanner;

public class Main {

  private static final Scanner scanner = new Scanner(System.in);
  private static final PetMachine petMachine = new PetMachine();

  public static void main(String[] args) {
    var option = -1;

    do {
      System.out.println("Choose one of the options:");
      System.out.println("1 - Bathing your pet");
      System.out.println("2 - Fill machine with water");
      System.out.println("3 - Fill machine with shampoo");
      System.out.println("4 - Check water in the machine");
      System.out.println("5 - Check shampoo in the machine");
      System.out.println("6 - Check if there is a pet in the bath");
      System.out.println("7 - Add a pet to the machine");
      System.out.println("8 - Remove pet from the machine");
      System.out.println("9 - Clean the machine");
      System.out.println("0 - Exit");
      option = scanner.nextInt();

      switch (option) {
        case 1 -> petMachine.takeAShower();
        case 2 -> setWater();
        case 3 -> setShampoo();
        case 4 -> verifyWater();
        case 5 -> verifyShampoo();
        case 6 -> checkIfHasPetInMachine();
        case 7 -> setPetInMachine();
        case 8 -> petMachine.removePet();
        case 9 -> petMachine.wash();
        case 0 -> System.exit(0);
        default -> System.out.println("Invalid option");
      }
    } while (true);

  }

  public static void setPetInMachine() {
    var name = "";
    while (name == null || name.isEmpty()) {
      System.out.println("Enter the pet's name:");
      name = scanner.next();
    }

    var pet = new Pet(name);
    petMachine.setPet(pet);
    System.out.println(pet.getName() + " is in the machine");
  }

  private static void checkIfHasPetInMachine() {
    var hasPet = petMachine.hasPet();
    System.out.println(hasPet ? "There is a pet in the machine" : "There is no pet in the machine");
  }

  private static void verifyShampoo() {
    var shampoo = petMachine.getShampoo();
    System.out.println("The shampoo tank has " + shampoo + " units");
  }

  private static void verifyWater() {
    var water = petMachine.getWater();
    System.out.println("The water tank has " + water + " units");
  }

  private static void setWater() {
    petMachine.addWater();
    System.out.println("Water added to the machine");
  }

  private static void setShampoo() {
    petMachine.addShampoo();
    System.out.println("Shampoo added to the machine");
  }

}
