import java.util.ArrayList;
import java.util.List;

public class UpperBoundWildCard {
  public static void main (String[] args) {
    
    List<Integer> numbers = new ArrayList<>();
    List<Double> doubles = new ArrayList<>();
    List<String> strings = new ArrayList<>();
    
    numbers.add(1);
    numbers.add(2);
    
    strings.add("asdas");
    
    doubles.add(0.2);
    doubles.add(3.7);
    
    printNumbers(numbers);
    printNumbers(doubles);
 // printNumbers(strings); This will give an error, because String is not a Number!
  }
  
  private static void printNumber(List<? extends Number> numbers){// This is a wildcard that extends number
    // Give me anything that is a number
    numbers.forEach(System.out::println);
    Number number = numbers.get(0);
    System.out.println(number);
    
    // Again, you can not add in the list, because we know it is a number,
    // But we don't know the specific type, it can be integer or double
    
    // You can only read
    
    
  }
}
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
