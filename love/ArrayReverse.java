package love;

public class ArrayReverse {
    public static void main(String[] args) {
        int[] a={12,14,68,39684,1365};
        int j=a.length-1;
        for(int i=0;i<=a.length/2;i++){

                int temp=a[i];
                a[i]=a[j];
                a[j]=temp;
                j--;



        }
        for(int ax:a){
            System.out.println(ax);
        }

    }
}
