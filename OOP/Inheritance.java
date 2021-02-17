package OOP;
class inherit1{
    inherit1(int a){
        System.out.println("this is a constructor and it will not be inherited to subclass  "+a);
    }

    String info="super";

    void m1(){
        System.out.println("super class");
    }
}
class inherit2 extends inherit1 {
    String info="super2";

    inherit2(){
      super(5); // default constructor is automatically inherited but this is how we use super key for paramitarized constructor
  }


    void m2(){
        System.out.println("sub class");
        System.out.println(super.info);  //it is info of super class


    }

}
public class Inheritance  {
    public static void main(String[] args) {
        inherit2 l1=new inherit2();
        l1.m1();
        System.out.println(l1 instanceof inherit1);  // instanceof keyword

    }

}
