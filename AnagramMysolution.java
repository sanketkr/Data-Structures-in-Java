//this program wont work with different cases, beware!
public class AnagramMysolution {
    public static void main(String[] args) {
        String s1="astr onomer",s2="moons tarer";

        if(s1.length()==s2.length()){
            for(int i=0;i<=s1.length()-1;i++){
                int w1=0;
                for(int j=0;j<s1.length();j++){         //aksar aisa hota h ki pahle andar wala loop likhne
                    if(s1.charAt(i)==s1.charAt(j)){     //ki kosish karo uske phir socho ki iss loop ko kitne baar
                        w1++;                            //chalana h total , wo ho jaayega wahar wala loop, lekin hamesha nahi

                    }
                }
                System.out.println(w1);
                int w2=0;
                for(int m=0;m<s2.length();m++){
                    if(s1.charAt(i)==s2.charAt(m)){
                        w2++;
                    }
                }
                System.out.println(w2);
                if(w1!=w2){

                    System.out.println("not");
                    break;}



            }
        }else {
            System.out.println("not equal");
        }
    }
}
