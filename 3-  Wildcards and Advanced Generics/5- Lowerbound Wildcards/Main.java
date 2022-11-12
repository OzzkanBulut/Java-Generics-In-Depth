import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class Main{
  public static void main(String[] args){
    
    List<Integer> integers = new ArrayList<>();
    integers.add(1);
    integers.add(2);
    integers.add(3);
    
    List<Double> doubles = new ArrayList<>();
    doubles.add(2.2);
    doubles.add(3.3);
    
   List<Number> numbers = new ArrayList<>(); // I'm okay with adding any number to the list
   addToList(numbers,2.2);
   addToList(numbers,33);
    
   printList(doubles);
   printList(doubles);
    
  }
  
  //List is either a Number Class, or the superclass of Number, Object Class
  private static void addToList(List<? super Number> list, Number n){ // This is the Lowerbound
    list.add(n);
  }
  
  private static void printList(List<? extends Number>list){// This is the upperbound
    list.forEach(System.out::println);
  }
}

/* PECS --> Producer extends Consumer Super
If the generic is producing something for us to take, USE EXTENDS
When the generic is consuming something(When we add something), USE SUPER*/
