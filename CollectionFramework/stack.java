package CollectionFramework;
import java.util.Stack;
public class stack {
    public static void main(String[] args) {
        Stack<Integer> s1=new Stack<>();
        s1.push(1);
        System.out.println(s1.peek());
        s1.pop();
        s1.push(2);

        System.out.println(s1.search(2));
        System.out.println(s1.search(5));
        //https://www.geeksforgeeks.org/stack-class-in-java/#82d2079a-8120-480f-9fc7-5cda825d56e7:~:text=search(Object%20element),the%20stack.%20Else%2C%20it%20returns%20%2D1.


    }
}
