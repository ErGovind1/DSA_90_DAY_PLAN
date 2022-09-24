import java.util.Scanner;

public class pattern4 {
    public static Scanner scn = new Scanner(System.in);
    public static void main(String args[]){
    //    singleLine(3);
    System.out.print("enter number of stars");
      int numberOfLine = scn.nextInt();
       Pattern(numberOfLine);
    }

    public static void Pattern(int numberOfLine){
       for(int i = 1; i<=numberOfLine;i++){
           singleLine(i);
        System.out.println();
        

       }
    }
    public static void singleLine(int numberOfStars){
        for(int i=1;i<=numberOfStars;i++){
           System.out.print("* ");
        }
    }
    public static void SingleLine(int numberOfStars){
        for(int i=numberOfStars; i>=1;i--){
            System.out.print("* ");
        }
    }
}
