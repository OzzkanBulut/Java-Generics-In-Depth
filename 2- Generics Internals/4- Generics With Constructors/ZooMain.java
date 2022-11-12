import Cage;
import Chicken;
import Tiger;

public class ZooMain {
  public static void main(String[] args) {
    
    Cage<Tiger> tigerCage = new Cage<Tiger>(new Tiger(), new Tiger()); // Constructor is Generic Too!
    // If constructor is not generic, it would have accepted a chicken as well
    
    Cage<Chicken> chickenCage = new Cage<Chicken>(new Chicken(), new Chicken());
    
