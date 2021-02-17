package OOP;
//classes doesn't take any space, objects take space in memory.
//any java file will contain only one public class and its name match file name.
// only static methods can be called in static main method

//method overloading -> two methods with same name and different signatures are different e.g below
//method overriding -> inheritance mein method in the child class with same signature is more priority
class overloading{
    static void over(int a,int b){
        System.out.println("it is int and int ");
    }
    static void over(int a , float b ){
        System.out.println("but is is int and float ");
    }
}

public class Intro {
    public static void main(String[] args) {
        overloading.over(5,6);
        overloading.over(5,(float)1.3);  // here typecasting is required because In Java, by default,
                                            // every floating-point number(1.3 here) is of the double data type.
                                            //  When we use floating-point numbers inside the program
                                            //  then the compiler and JVM treat them as a double data type.
    }
}
