package domain;


 /**
 * The class Animal
 */ 
public class Animal {

   protected int weight;

    protected int height;

   protected String name;


/** 
 *
 * It is a constructor. 
 *
 */
    public void Animal() { 

        name = "animal created";
        weight = 25;
        name = "Random animal";
    }


/** 
 *
 * Eating
 *
 */
    public void Eating() { 

        System.out.println("Eating!");
    }


/** 
 *
 * Look
 *
 */
    public void Look() { 

        System.out.println("Looking around!");
    }


/** 
 *
 * Sleep
 *
 */
    public void Sleep() { 

        
        System.out.println("Zzzzz-Zzzz");
    }


/** 
 *
 * Walk
 *
 */
    public void Walk() { 

        System.out.println("Walking");
    }

    @Override

/** 
 *
 * To string
 *
 * @return String
 */
    public String toString() { 

         return "My animal : " + "\nWeight : \t" + weight + " \nHeight : \t" + height +"\n name:\t " +name;

    }
    
}
