import java.util.ArrayList;
import java.util.List;

public class GenericvsArray {
  public static void main(String[] args){
    
    List<String> namesList = new ArrayList<>();
    addToNames(namesList, "Name 1");
  //incorrectAddToNames(namesList,3); // Works but it should not work! This is not type safe
    
    String[] namesArray = new String[5];
    addToArray(namesArray, "Name 1");
    
    incorrectAddToArray(namesArray,3);
    
    String anotherName = namesArray[1]; // Will give a ClassCastException
  }
  
  
  private static void incorrectAddToArray(Object[] namesArray, int i){
 // We cheated the compiler by telling the array takes objects 
    namesArray[0] = i; // THE ERROR WILL HAPPEN HERE
 // This error is not catched UNTIL IT'S USED IN THE RUNTIME   
  
  }
  
  private static void addToArray(String[] namesArray, String s){
    namesArray[0] = s;
  }
  
  private static void addToNames(List<String> names, String s){
    names.add(s);
  }
  
  private static void incorrectAddToNames(List names, Integer i){
    names.add(i);
  
  }
}
