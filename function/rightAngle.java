import java.util.Scanner;

public class rightAngle {
    public static Scanner scn = new Scanner(System.in);

    public static void main(String args[]){
        // for(int j=1;j<=20;j++){
        //     for(int k=1;k<=j;k++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
        // for(int i=5;i>=1;i--){
        //     for(int j=1;j<=i;j++){
        //         System.out.print("*");

        //     }
        //     System.out.println();
        // }
        // using Function
        // singleLine(1);
        // singleLine(2);
        // singleLine(3);
        // singleLine(4);
       int numberofline=scn.nextInt();
          
       pattern(numberofline);


    }
    public static void pattern(int numberofline){
        for(int j=numberofline;j>=1;j--){
            singleLine(j); 
        }
    }

    public static void singleLine(int numberOfstars){
        for(int i =1; i<=numberOfstars;i++){
            System.out.print("* ");
        }
        System.out.println();
    }
}
