import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AutoBoxing {
  
  public static void main(String[] args){
    // AutoBoxing with Generics
    
    int i = 10;
    // Every primitive type has an equivalent class where we can create an instance of an object that represents the value
    // Each primitive has a wrapper class
    
    Integer x; // This is not a primitive, it's an object  
    x = i; // Left side is object, right side is primitive, it should not work, But it does! 
    
    // Double, Long, Integer ---> Wrapper Classes
    
    Integer z = i ; // It's boxing primitive inside an object, THIS IS CALLED AUTOBOXING
    
    Integer a = new Integer(2)
    int c = a ; // This is the unboxing, opposite of boxing
    
    List<Integer> numbers = Arrays.asList(10,20,30);
    
    System.out.println(numbers.get(0));
    
    // Generic types have to be java types, they can not be primitives!
    // Because of that we have those wrapper classes = Integer, Double, Long...
