
public class Zoo {
  public static void main(String[] args) {
    
    Cage<Monkey> monkeyCage = new Cage<Monkey>(); // This is a monkey cage! Does not accept Lions
    monkeyCage.setAnimal1(new Monkey());
    
    // We prevented Cage to accept different animals
    // We can not put Lion and Monkey in a cage together!
    
    Cage<Lion> lionCage = new Cage<Lion>(); // This is a lion cage. Does not accept monkeys!
    
    lionCage.setAnimal1(new Lion());
    lionCage.setAnimal2(new Lion());
    
    // We guarentee that in the future, if there are new animals in the zoo, There is no need to change the code!
