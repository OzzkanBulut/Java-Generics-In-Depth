import java.util.ArrayList;
import java.util.List;

public class Main {
  public static void main(String[] args) {
    
    List<String> names = new ArrayList<>();
    names.add("Name 1");
    names.add("Name 2");
    
    printList(names); // Works!
    
    List<Integer> integers = new ArrayList<>();
    numbers.add(1);
    numbers.add(2);
    
 // printList(integers) ; --> This will not work!
  }
  
  private static void printList(List<String> names) { // List<Object> does not work here!
    // Polymorpishm is not working in generics!
    for(String name: names){
      System.out.println(name);    
    }
    names.add("Hello");
  
  }
}
// Inheritance in generics does not work the way we usually do inheritance
// To make inheritance with generics, WE NEED TO USE WILDCARS!
  
