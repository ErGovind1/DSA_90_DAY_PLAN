import java.util.Scanner;

public class pattern3 {
    public static Scanner scn = new Scanner(System.in);
    public static void main(String args[]){
         int n= scn.nextInt();
         for(int i=1;i<=5;i++){
            for(int j =1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
         }
    }
}
