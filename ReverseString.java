
public class ReverseString {
    public static void main(String[] args) {
        String b="a bcd efgh ijklm" ;
        String[] c=b.split(" ",-1);

   int i=0,j=c.length-1;
    while(i<j){
        String temp=c[i];
        c[i]=c[j];
        c[j]=temp;
        i++;
        j--;
      }
        for(String d:c) {
            System.out.println(d);
        }

    }
}
