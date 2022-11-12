# Why Generics ?

## Imagine a World Without Generics  

ArrayList names = new ArrayList();  
  
names.add("Name 1");  
names.add("Name 2");  
  
String firstName = names.get(0); // Will this work? No!
Because your arraylist class would look like this:  
```
public class ArrayList {

    public void add(Object o) {
    
    }
    
    public Object get(int position){
    
    }
}
```
**This is a problem**  
You can not say names.get(0), you have to cast it to String for java to know the type.  
String firstName = (String)names.get(0);  
**Hey compiler, this is a string of names, there is no way for me to tell you.  
Because we have no generics.**  

This is also fine, but it is painful to cast every element you are trying to get.  
Everytime we need to pick a name, we need to cast it to a String.  

Second problem is that you can add something else that is not a String.  
There is nothing stopping me putting here an integer or any other object.  

**This is why we need generics.  
When we have collections, we need to specify the collection's type with generics.  
Otherwise, it will not be type-safe and we can put anything we want.  
Which is ridiculous!**  
