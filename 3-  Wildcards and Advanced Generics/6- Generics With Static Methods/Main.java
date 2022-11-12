import Cage;
import Lion;

public class Main {
  public static void main(String[] args){
    
    Lion lion1 = new Lion();
    Lion lion2 = new Lion();
    
    Cage.isCompatible(lion1, lion2); // This works, because we specified the E type in the static method!
    
