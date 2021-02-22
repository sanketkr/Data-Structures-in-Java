// insertion sort is good when arrray is small size otherwise quickSort and heapsort is better

package sorting;


class Insertion {
    Insertion(int[] arr){
        
        for(int i=1;i<arr.length;i++){
            int value=arr[i];
            int j=i-1;
            while(j>=0 && arr[j]>value){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=value;
        }

        for(int x:arr){
            System.out.println(x);
        }
   }



}
