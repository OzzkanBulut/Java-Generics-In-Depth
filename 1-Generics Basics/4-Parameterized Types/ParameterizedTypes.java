import java.util.ArrayList;
import java.util.List;

public class ParameterizedTypes {
  
  public static void main(String[] args){
    
    List<String> list = new ArrayList<>();
    List<Integer> numbers = new ArrayList<>();
    
    // Expression numbers remembers that this is a type of Integer
    // Wherever that expression goes he remembers the type and behaviour
    // Although, this may be not true with Eraser methods
    
    list.add("one");
    list.add("two");
