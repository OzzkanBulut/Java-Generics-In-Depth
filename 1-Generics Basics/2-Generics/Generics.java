import java.util.ArrayList;
import java.util.Date;

public class Generics {
  
  public static void main(String[] args){
      
    ArrayList names = new ArrayList();
    names.add("Name 1");
    names.add("Name 2");
    
    String name = (String) names.get(0) // We force-casted object to String
    System.out.println(name);
    
    names.add(new Date()); // Compiler does not complain
    // Compiler adds any object because we have not specified the ArrayList type
    // String date = (String) names.get(2); --> Throws a ClassCastException, can not cast one class to another
    
    // This is not safe!
    // This is why generics are needed. With generics, we are specifying the type of the collection
    
    ArrayList<String> names1 = new ArrayList<String>();
    
    // names1.add(new Date()); gives an error. Because we told compiler that this arraylist is gonna contain only strings
    
    names1.add("Name A");
    
    ArrayList<Date> dates = new ArrayList<Date>();
    dates.add(new Date()); // This works! Because generic of the dates arraylist is Date
    
    Date foo = dates.get(0);
    
    System.out.println(foo); // We can get the date now
    
    // ArrayList<int> integer = new ArrayList<int>(); --> Does not work! Generic has to be a Java Type
    
    // GENERICS DO NOT WORK WITH PRIMITIVE TYPES!
    
    
      
