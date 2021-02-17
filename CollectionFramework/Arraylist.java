package com.company.CollectionFramework;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

class generics<x,y>{
    //x and y is generics here. this generalized the data types here
    //now we can make gen1 and gen2 of any type that we want by passing generics
    x gen1;
    y gen2;
    generics(x gen1,y gen2){
        this.gen1=gen1;
        this.gen2=gen2;
    }
}
public class Arraylist {
    public static void main(String[] args) {
        ArrayList age=new ArrayList(); // without generics it can store any data type in this arraylist
        age.add(5);




        generics<String, Integer> obj1=new generics<>("hello",1);
        //dont use 'int' here use 'Integer' . - something to do with wrapper classes


        ArrayList<String> age2=new ArrayList<>();//using generics , now it can take strings as input only
        ArrayList<Integer> age1=new ArrayList<Integer>();


        List<Integer> x1 =new ArrayList<>();
        /*this is better way to use collection framework as object will be of arraylist but
        later we can use x1 as Linkedlist also just by changing "List x1 =new LinkedList();"
        */

        x1.add(5);
        x1.add(6);




        System.out.println(x1.getClass());
        System.out.println(x1);


       List<Integer> x2 =new LinkedList<>();
        System.out.println(x2.getClass());
        System.out.println(x2);


        x2.add(7);
        x2.add(8);
        System.out.println(x2);

        Integer[] temp =new Integer[x2.size()];//int wont work because x2 is of type 'Integer' not 'int'
        System.out.println(temp.length);

        x2.toArray(temp);
        System.out.println();
        for (Integer x:temp
             ) {
            System.out.println(x);
        }



        Vector<Integer> v1=new Vector<>();
//https://www.geeksforgeeks.org/java-util-vector-class-java/

    }
}
