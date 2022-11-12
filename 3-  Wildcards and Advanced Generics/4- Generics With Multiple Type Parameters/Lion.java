
public class Lion extends Animal implements Eats,Runs{
    @Override
    public void eat() {
        System.out.println("Lion eats");
    }

    @Override
    public void runs() {

        System.out.println("Lion runs");
    }
}
