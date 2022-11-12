import Cage;
import Chicken;
import Tiger;
public class Main {
  public static void main(String[] args){
    Cage<Chicken> chickenCage = new Cage<Chicken>(new Chicken(), new Chicken()); // This works because chicken is an animal!
    // Cage<String> stringCage = new Cage<String>() --> This will not work! Because String object does not extends Animal!
    
    Tiger t1 = new Tiger();
    Tiger t2 = new Tiger();
    
    t1.setType("Big");
    t1.setType("Big");
    
    Cage<Tiger> tigerCage = new Cage<Tiger>(t1,t2); // We can put two tigers in a cage, and their types are equal as well!
    
  
