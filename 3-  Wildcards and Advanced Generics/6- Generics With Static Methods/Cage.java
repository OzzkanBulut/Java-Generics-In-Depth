public class Cage<E extends Animal & Eats & Runs> {
  
  private E animal1;
  private E animal1;
  
  public Cage(){}
  
  public Cage(E animal1, E animal2){
    this.animal1 = animal1;
    this.animal2 = animal2;
  }
  
  public E getAnimal1() {
        return animal1;
  }

  public void setAnimal1(E animal1) {
      this.animal1 = animal1
  }

  public E getAnimal2() {
      return animal2;
  }

  public void setAnimal2(E animal2) {
      this.animal2 = animal2;
  }
  
  private static<E extends Animal> boolean isCompatible(E animal1, E animal2){ // E can not be referenced from a static context
    // Because there is no specific type information for static method to get
    // Because this is a static method, there is no instance of Cage class yet
    // And because of that, E of cage is not clear to the static method
    // Which is why, we need to define E also in the static method
    return animal1.getType().equals(animal2.getType());
  }
}
