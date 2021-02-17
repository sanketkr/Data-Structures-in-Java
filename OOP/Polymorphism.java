package com.company.OOP;
//abhi ke liye bas itna yaad rakh -> two types hote hain
// run time poly-> overriding - slower execution   |  compile time poly -> overloading  -faster
//https://youtu.be/eIO9dNLkhDQ      -> navin reddy
class A{
    void m(){
        System.out.println("A");
    }
}
class B extends A{
    void m(){
        System.out.println("B");
    }
    void m2(){
        System.out.println("A reference don't know about me");
    }
}
class C extends A{
    void m(){
        System.out.println("C");
    }
}
public class Polymorphism {
    public static void main(String[] args) {
        A obj=new B(); // runtime polymorphism
        B objb =new B();
        C objc=new C();

        obj.m();
     //   obj.m2();     -> error because reference to A dont know m2 method we can  call only those
        //method which is present in A and then in in B i.e override

    obj=objc; //dynamic method dispatch because method at runtime when when we change valueof obj.
    obj.m();

    }
}
