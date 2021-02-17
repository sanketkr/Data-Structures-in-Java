package Dsa;
import java.util.Stack;

//there might be some unhandlede cornor cases in this solution
public class BalancedParenthesis {
    public static void main(String[] args) {
        String s="[()]{}{[()(])]()}";
       Stack<Character> s1=new Stack<>();

       boolean check=true;

            for (int i = 0; i < s.length(); i++) {
                if(check){
                    char temp = s.charAt(i);
                    if (temp == '[' || temp == '{' || temp == '(') {
                        s1.push(temp);
                        System.out.println("push " + temp);
                        System.out.println(s1);


                    } else {
                        switch (temp) {
                            case ']':
                                if (s1.peek() == '[') {
                                    s1.pop();
                                    System.out.println("pop [");
                                    System.out.println(s1);

                                    break;//break is very important ,try removing it and code misbehaves
                                } else {
                                    System.out.println("not balanced1");
                                    check = false;
                                    break;

                                }
                            case '}':
                                if (s1.peek() == '{') {
                                    s1.pop();
                                    System.out.println("pop {");
                                    System.out.println(s1);
                                    break;

                                } else {
                                    System.out.println("not balanced2");
                                    check = false;
                                    break;
                                }
                            case ')':
                                if (s1.peek() == '(') {
                                    s1.pop();
                                    System.out.println("pop (");
                                    System.out.println(s1);
                                    break;
                                } else {
                                    System.out.println("not balanced3");
                                    check = false;
                                    break;
                                }
                        }


                    }
                }


            }
        if (check && s1.isEmpty()) System.out.println("balanced");
        System.out.println(s1);
    }

}
