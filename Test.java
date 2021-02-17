package com.company;
// { Driver Code Starts
//Initial template for Java

import java.io.*;
import java.util.*;

class Test {

    // } Driver Code Ends


//User function template for Java

    public static void sort012(int a[], int n){
        int low=0,mid=0,high=n-1;
        for(int i=mid;i<=high;i++){
            if(a[i]==0){
                swap(a,i,low);
                low++;

            }
            if(a[i]==2){
                swap(a,i,high);
                high--;
            }

        }

    }
    static void swap(int a[],int x,int y){
        int temp=a[x];
        a[x]=a[y];
        a[y]=temp;
    }


// { Driver Code Starts.

    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim()); //Inputting the testcases
        while(t-->0){
            int n = Integer.parseInt(br.readLine().trim());
            int arr[] = new int[n];
            String inputLine[] = br.readLine().trim().split(" ");
            for(int i=0; i<n; i++){
                arr[i] = Integer.parseInt(inputLine[i]);
            }
            sort012(arr, n);
            StringBuffer str = new StringBuffer();
            for(int i=0; i<n; i++){
                str.append(arr[i]+" ");
            }
            System.out.println(str);
        }
    }
}

// } Driver Code Ends