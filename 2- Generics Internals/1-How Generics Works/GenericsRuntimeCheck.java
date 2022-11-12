import java.util.ArrayList;
import java.util.List;

public class GenericsRuntimeCheck {
  public static void main(String[] args){
    
    List<String> names = new ArrayList<>();
    
    
    addToNames(names,"Name 1");
    addToNames(names,"Name 1");
    
    System.out.println(names);
    
    // List names2 = names;  This will work
    // Right side is a generic type which only accepts strings
    // Left side is not a generic type  
    
    incorrectAddToNames(names,100); // This will also work!
    
    System.out.println(names);
    
    // What we told the compiler is that this is a list of string
    // Names should contain only strings
    
    String name3 = names.get(2);
    
    // System.out.println(name3); --> We Will get ClassCastException  
    
    // The lesson here is this:  
    // List<String> names --> The generic String only associates with the expression "names"
    // Not the instance itself! Wherever names goes, compiler says this is a list of string
    // But when you take it out of that context and you assign it to something else which is not of that type
    // Compiler does not check it. So it allows you to add any object.
    // The only reason we are typing List<String> is that we want compiler to protect us from any other types
    
    
    // THIS IS CALLED TYPE ERASER --> IT ERASES THE TYPE WE SPECIFIED AT FIRST
    // POPULAR INTERVIEW QUESTION!!
    // BEST PRACTICE IS TO ALWAYS USE GENERICS WHEN DEALING WITH COLLECTIONS
    
    // ANYTHIN YOU DO WITH GENERICS IS JUST COMPILER TIME, NOT RUNTIME
    // WHEN JAVA CONVERTS INTO BYTE CODE, THERE ARE NO GENERICS THERE!
    
    // BASICALLY, GENERICS MAKES IT EASIER TO DEAL WITH COLLECTIONS 
    // AND MAKES DEVELOPERS GET IN TOUCH WITH COMPILERS TO SAY THAT
    // HEY I'M WORKING WITH COLLECTIONS BUT I WANT MY COLLECTION TO ACCEPT ONLY THAT TYPE
    // PLEASE DON'T ACCEPT ANY OTHER TYPE AND WARN ME IF THERE ARE THE TYPES I DON'T WANT
  }
  
  private static void addToNames(List<String> names, String s){
    names.add(s);
  }
  
  private static void incorrectAddToNames(List names, Integer integer){
    names.add(integer);
  }
  
}
    
    
