//java is always pass by value but when data type passed is non-primitive then reference is passed like below
//when dogs d1 is passed to swap then "a" actually now refers to d1 it can change value of d1 object from inside


package com.company.OOP;
class Dogs{
    int legs;
}
public class Callbyvalue {

    public static void main(String[] args) {
        Dogs d1=new Dogs();
        d1.legs=1;
        Dogs d2=new Dogs();
        d2.legs=2;

        swap(d1,d2);
        System.out.println(d1.legs);
    }
static void swap(Dogs a,Dogs b){
        Dogs temp=a;
        a=b;
        b=temp;

    System.out.println(a.legs +"   "+b.legs);
    b.legs=20;
    }





}
