package domain;

public class Tiger extends Predator {

    private int age;

    public Tiger(int weight, int height, String name, int age) {
        this.name = name;
        this.weight = weight;
        this.height = height;
        this.age = age;
        
    }

    public Tiger() {
        this( 55, 100, "Tiger", 8 );
    }

    public Tiger(String name) {
        this(55, 100, name, 8);
    }

    
    public void speak() {
        System.out.println("Rrrr - move fuster live longer!");
    }

    @Override
    public void Walk() {
       System.out.println("I`m walking around you`d better run as far as you can!");
    }

    @Override
    public void Sleep() {
         System.out.println("Try to wake me up and you`ll never see sunset! ");
    }

    @Override
    public void Look() {
        System.out.println("You`d better hide... Anyway i need a dinner..");
    }

    @Override
    public void Eating() {
       System.out.println("Yuor fortune that i`m not eating you!");
    }

    @Override
    public String toString() {
        return super.toString() + "\nAge:\t"+age;
    
    }
}
