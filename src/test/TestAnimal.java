package test;

import domain.Tiger;


 /**
 * The class Test animal
 */ 
public  class TestAnimal {


/** 
 *
 * Main
 *
 * @param args  the args
 */
    public static void main(String[] args) { 

        
        Tiger tiger  = new Tiger();
        System.out.println(tiger);
        tiger.Eating();
        tiger.Look();
        tiger.Walk();
        tiger.Sleep();
    }
}
