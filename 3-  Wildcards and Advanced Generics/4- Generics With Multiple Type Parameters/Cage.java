public class Cage<E extends Animal & Runs & Eats>{
  // E extends class Animal, and implements Runs and Eats interface
  // In generics, there is only extends word. There are no usage of "implements"
  // Because of that, even if a generic implements an interface, you have to write extends
  // One important thing is class names should come first
  // If we were to type Animal class after runs & eats, it wouldn't work
  
  
  private E animal1;
  private E animal2;
  
  public Cage(){}
  
  public Cage(E animal1, E animal2){
  
    this.animal1 = animal1;
    this.animal2 = animal2;
    }
  
  public void setAnimal1(E animal1){
    this.animal1 = animal1;
  }
  
  public void getAnimal1(){
    return animal1;
  }
  
  public void setAnimal2(E animal2){
    this.animal2 = animal2;
  }
  
  public void getAnimal2(){
    return animal2;
  }
  
  public void feedAnimal(){
    animal1.eat();// E implements eats, so we can do that
    animal2.run();// E implements Runs, so we can do that
  }
}
    
    
    
    
    
