package domain;

public class Animal {

   protected int weight;

    protected int height;

   protected String name;

    public void Animal() {
        name = "animal created";
        weight = 25;
        name = "Random animal";
    }

    public void Eating() {
        System.out.println("Eating!");
    }

    public void Look() {
        System.out.println("Looking around!");
    }

    public void Sleep() {
        
        System.out.println("Zzzzz-Zzzz");
    }

    public void Walk() {
        System.out.println("Walking");
    }

    @Override
    public String toString() {
         return "My animal : " + "\nWeight : \t" + weight + " \nHeight : \t" + height +"\n name:\t " +name;

    }
    
}
