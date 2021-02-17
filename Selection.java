package com.company;
//worst case O(n2)
public class Selection {
    public static void main(String[] args){
        int[] arr={123,213,2,323,234,232,4242};
        int n=arr.length;
        for (int i=0;i<=n-2;i++){       // from 0 to n-2
            int min=i;
            for(int j=i+1;j<=n-1;j++){      // from i+1 to n-1

                if(arr[j]<arr[min]) {
                    min = j;
                }

            }
            int temp=arr[i];
            arr[i]=arr[min];
            arr[min]=temp;
        }
        for(int a:arr){
            System.out.println(a);
        }
    }
}
