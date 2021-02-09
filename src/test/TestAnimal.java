package test;

import domain.Tiger;

public  class TestAnimal {

    public static void main(String[] args) {
        
        Tiger tiger  = new Tiger();
        System.out.println(tiger);
        tiger.Eating();
        tiger.Look();
        tiger.Walk();
        tiger.Sleep();
    }
}
