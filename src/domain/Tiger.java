package domain;


 /**
 * The class Tiger extends predator
 */ 
public class Tiger extends Predator {

    private int age;


/** 
 *
 * Tiger
 *
 * @param weight  the weight
 * @param height  the height
 * @param name  the name
 * @param age  the age
 * @return public
 */
    public Tiger(int weight, int height, String name, int age) { 

        this.name = name;
        this.weight = weight;
        this.height = height;
        this.age = age;
        
    }


/** 
 *
 * Tiger
 *
 * @return public
 */
    public Tiger() { 

        this( 55, 100, "Tiger", 8 );
    }


/** 
 *
 * Tiger
 *
 * @param name  the name
 * @return public
 */
    public Tiger(String name) { 

        this(55, 100, name, 8);
    }

    

/** 
 *
 * Speak
 *
 */
    public void speak() { 

        System.out.println("Rrrr - move fuster live longer!");
    }

    @Override

/** 
 *
 * Walk
 *
 */
    public void Walk() { 

       System.out.println("I`m walking around you`d better run as far as you can!");
    }

    @Override

/** 
 *
 * Sleep
 *
 */
    public void Sleep() { 

         System.out.println("Try to wake me up and you`ll never see sunset! ");
    }

    @Override

/** 
 *
 * Look
 *
 */
    public void Look() { 

        System.out.println("You`d better hide... Anyway i need a dinner..");
    }

    @Override

/** 
 *
 * Eating
 *
 */
    public void Eating() { 

       System.out.println("Yuor fortune that i`m not eating you!");
    }

    @Override

/** 
 *
 * To string
 *
 * @return String
 */
    public String toString() { 

        return super.toString() + "\nAge:\t"+age;
    
    }
}
