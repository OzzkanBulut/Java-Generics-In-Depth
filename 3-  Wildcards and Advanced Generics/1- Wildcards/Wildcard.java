import java.util.ArrayList;
import java.util.List;

public class Wildcard {
  public static void main(String[] args){
    
    List<String> names = new ArrayList<>();
    List<Integer> numbers = new ArrayList<>();
    
    names.add("Name 1");
    names.add("Name 2");
    
    numbers.add(1);
    numbers.add(2);
    
    printList(names);
    printList(numbers);
    
    List<?> temp = names;
    temp = numbers;
    temp.get(0); // Works!
 // temp.add(2) ; --> DOES NOT WORK!
  }
  
  private static void printList(List<?> list){// ? means this is a specific type which is unknown, but that is one type
    // This works!
    names.forEach(System.out::println);
 // names.add("Foo"); --> This does not work! We can not add something because the type of the list unknown
 // Type of the list can be anything, which is why we can not add something to the list
 // By using wildcards like this, all we can do is reading the list
    names.get(0); // Returns an object --> It's kinda behaving like a list of object
 // names.add(new Object()); --> Not gonna work either, compiler does not know the type of the list!
    
 // When we use wildcars, we give up the ability to add something to the list
 // We can only read   
  }
}
    
    
    
    
    
    
    
    
    
    
    
    
    
    
