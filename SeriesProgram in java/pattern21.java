import java.util.Scanner;

public class pattern21 {
    public static Scanner scn = new Scanner(System.in);
    public static void main(String args[]){
        System.out.println("Enter the row");
        int i = scn.nextInt();
        System.out.println("enter the columb");
        int j = scn.nextInt();
        printSqare( i,j);
    }
    public static void printSqare(int n , int m){
        for(int i =1;i<=n;i++){
            for(int j =1;j<=m;j++){
                if(i==1||i==n||j==1||j==m){
                      System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
