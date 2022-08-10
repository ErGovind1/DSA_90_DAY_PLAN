package AUGUEST_3;

import java.util.Scanner;

public class selection {
    public static Scanner scn = new Scanner(System.in);
    public static void main(String args[]){
        // int arr[] ={7,5,4,3,2,1,6};
        // printArray(arr);
        inputArray();
        // https://drive.google.com/drive/folders/1FrPfIAkHgDURFYnMENGALTmDN5oMVT0a?usp=sharing
        // selectionSort(arr);
        // printArray(arr);
    }
    public static void inputArray(){
        System.out.print("Enter array Size");
        int n = scn.nextInt();
        int arr[] = new int[n];
        System.out.print("enter array input");
        for(int i=0;i<n;i++){
           arr[i] = scn.nextInt();
        }
        selectionSort(arr);
        printArray(arr);
    }


    public static void selectionSort(int arr[]){
        for(int i= arr.length-1;i>=0;i--){
           int maxidx =0;
           for(int j=0;j<=i;j++){
              if(arr[j]>arr[maxidx]){
                maxidx =j;
              }
           }
           swap(arr,i,maxidx);
        }
    }
    
    public static void swap(int arr[],int i,int j){
        arr[j] =((arr[i]+arr[j])-(arr[i]=arr[j]));
    }
   public static void printArray(int arr[]){
        for(int i=0; i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
   }

}
