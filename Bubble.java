package AUGUEST_3;

public class Bubble {
    public static void main(String args[]){
        int arr[] = {2,3,1,-6,-5};

        printArray(arr);
        bubble_sort(arr);
        printArray(arr);

    }
    public static void bubble_sort(int arr[]){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-1;j++){
                if(arr[j]>arr[j+1]);
                swap(arr ,j,j+1);
            }

        }
    }
    public static void swap(int arr[],int i ,int j){
        arr[j]=((arr[i]+arr[j])-(arr[i]=arr[j]));
    }

    public static void printArray(int arr[]){
        for(int i =0;i<arr.length;i++){
           System.out.print(arr[i]+" ");
           
        }
        System.out.println();
    }

}
