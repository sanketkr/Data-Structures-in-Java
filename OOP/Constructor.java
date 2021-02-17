package com.company.OOP;
//constructors are used to initialize some code at object creation time only.

//constructor vs method
// overloaidng is possible in both
// constructor has no return

//we have to define default constructor before calling it


class Vehicle{
    Vehicle (){         //this is default constructor
        System.out.println("default");
    }
    Vehicle (int a,int b){
        System.out.println(a+" "+b);
    }

}
public class Constructor {

    public static void main(String[] args) {
        Vehicle v1=new Vehicle(); // 1st vehicle is class 2nd one is for constructor. even when we dont define a define
        // constructor it is made by java automatically. but in case of more than one constructor we have to define the
        // the default constructor explicitally if we intend to call default one .
        //v1.Vehicle(); -> error , because this way is for method, constructors are called at initialization only
    }
}
