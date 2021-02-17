package com.company.OOP;
//static is related to classes, it is run once only(when class is loaded)(memory management) and is present in all objects.
//https://www.youtube.com/watch?v=qRCEdWQ0f4Q&t=651s
//constructor memory is initialized when obj is created but static when class is loaded

class s {
    static int salary;
    static String breed;
    static String ceo = "ramesh";  //static variable aka class variables
    String name;
    String dept;

    static {         //static block
        salary = 10000;
        breed = "humans";
    }


    class Nested {
        void nest() {
            System.out.println("i am non-static nested");
        }
    }
   static class Nested1 {
        void nest() {
            System.out.println("i am static nested");
        }
    }

}
public class StaticKeyword {
    public static void main(String[] args) {
        System.out.println(s.ceo);   //we can also directly call s.ceo because ceo was allocated when class loaded.
        System.out.println(s.salary);
        s e1=new s();
        e1.name="name1";
        s e2=new s();
        e2.name="name2";

        System.out.println(e1.name+ ":"+e1.ceo);
        System.out.println(e2.name+ ":"+e2.ceo);
        //memory for ceo is allocated only once

        {//here is an inner class without static
            s s1 = new s();

            s.Nested a = s1.new Nested(); //this need reference to outer class first via s1
        }

        {//but nested static class doesn’t need reference of Outer class (reference in the sense without creating an object)
            s.Nested1 s2=new s.Nested1();
        }
    }
}
