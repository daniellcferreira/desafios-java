public class PetMachine {

  private boolean clean = true;
  private int water = 30;
  private int shampoo = 10;
  private Pet pet;

  public void takeAShower() {
    if (this.pet == null) {
      System.out.println("No pet to shower");
      return;
    }

    this.water -= 10;
    this.shampoo -= 2;

    pet.setClean(true);
    System.out.println(pet.getName() + " is clean now");
  }

  public void addWater() {
    if (this.water == 30) {
      System.out.println("The water tank is full");
      return;
    }

    this.water += 2;
  }

  public void addShampoo() {
    if (this.shampoo == 10) {
      System.out.println("The shampoo tank is full");
      return;
    }

    this.shampoo += 2;
  }

  public int getShampoo() {
    return shampoo;
  }

  public int getWater() {
    return water;
  }

  public boolean hasPet() {
    return pet != null;
  }

  public void setPet(Pet pet) {
    if (!this.clean) {
      System.out.println("The machine is dirty");
      return;
    }

    if (hasPet()) {
      System.out.println("There is already a pet");
      return;
    }

    this.pet = pet;
  }

  public void removePet() {
    this.clean = this.pet.isClean();

    System.out.println("Pet removed and clean");
    this.pet = null;
  }

  public void wash() {
    this.water -= 10;
    this.shampoo -= 2;
    this.clean = true;
    System.out.println("Machine is clean now");
  }

}
