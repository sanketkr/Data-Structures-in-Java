//https://youtu.be/ctm_ym5fppk          -> good explanation

//inheritance->UC->DC   prerequisites

//when an obbject is created it has two parts first part reference which is declaration of the object type
//second is memory alloted to it in the heap which is of default constructor size or whatever the constructor is. -> https://youtu.be/V-PQvKUtSY8
package OOP;

class inherits1{
    String info="super";

    void m1(){
        System.out.println("super class");
    }
}
class inherits2 extends inherits1 {
    String info="super2";
    void m2(){
        System.out.println("sub class");
        System.out.println(super.info);  //it is info of super class
    }
}
class inherits3 extends inherits1 {
    String info="super3";
    void m3(){
        System.out.println("sub class");
        System.out.println(info);  //it is info of sub class
    }
}
public class Casting {
    public static void main(String[] args) {
        inherits2 obj2=new inherits2();

        inherits1 p=obj2;        //upcasting

        inherits1 superclass=new inherits1();

    //    inherits2 p2=superclass;          -> error
        inherits2 p2=(inherits2)superclass;

    }




}
