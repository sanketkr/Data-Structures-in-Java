package com.company.OOP;
//abstraction means reducing complexity, show what can be done not how it is done
//Abstract function must have abstract class, abstract class can have abstract and concrete methods
//abstract method must be overridden in child class
class Car  {
    static void repair(Car Car){
        System.out.println(" car is repairedd");
    }
}
class Wagon extends Car{
    static void repair(Wagon x){
        System.out.println(" wagon is repairedd");
    }
}
class Audi extends Car{
    static void repair(Audi x){
        System.out.println(" Audi is repairedd");
    }
}
public class Abstraction {

static void repair(Car x){
    System.out.println("car is repaired");
}
static void repair(Wagon x){
        System.out.println("Wagon is repaired");
    }
    static void repair(Audi x){
        System.out.println("Audi is repaired");
    }
    public static void main(String[] args) {
        Car m=new Car();
        Wagon w=new Wagon();
        repair(w);


    }
}
