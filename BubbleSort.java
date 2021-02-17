//worst case O(n2)
public class BubbleSort {

    public static void main(String[] args) {
        int[] arr={123,213,2,323,234,232,4242};
        int n=arr.length;
        boolean sorted=true;
        for(int i=0;i<=n-1;i++){        // i to (n-1)
            for(int j=0;j<=n-2-i;j++){   // j to n-2-i
                if(arr[j+1]<arr[j]){
                    int temp =arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    sorted=false;
                }
            }
            if(sorted)break;
        }

        for(int a:arr){
            System.out.println(a);
        }

    }

}
