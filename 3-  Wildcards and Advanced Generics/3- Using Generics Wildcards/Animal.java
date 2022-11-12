public class Animal {
 private String type;
  
  public void setType(String type){
    this.type = type;
  }
  
  public String getType(){
    return type;
  }
 
 // Overriding these two methods will make animal objects comparable
 @Override
    public boolean equals(Object o) { 
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return Objects.equals(type, animal.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type);
    }
  
}
