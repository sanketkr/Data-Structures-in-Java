

//"" -> string    ''-> char
// string in java is an object not an array of character ending in /0 (null) as in c.So we cannot access
//each element of sting in java directly, although there are many in built methods for sting object

//string when initialised using literal then it is initialised in "string pool area" but when initialised
// using new keyword then it is in heap area and both are not equal , example in code below.
//Why Java uses the concept of String literal?
//->To make Java more memory efficient

//strings are immutable(no change)

//methods refer(beanote_highlighted)->https://www.w3schools.com/java/java_ref_string.asp
public class sfdsd {

    public static void main(String[] args) {
      //  Scanner sc=new Scanner(System.in);
      //  int my=sc.nextInt();
        String poolArea="hello";
        String HeapArea=new String("hello");  // original keyword is ide feature BTW
    //    System.out.println(poolArea==HeapArea);

     //   System.out.println(HeapArea.equals(poolArea)); // equals compare values at object level
        int[] numArray={2432,24,324};
        char[] charArray=HeapArea.toCharArray();
      System.out.println(charArray);
        System.out.println(numArray);



    }

}
