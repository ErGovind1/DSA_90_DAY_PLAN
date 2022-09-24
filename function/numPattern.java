import java.util.Scanner;

public class numPattern{
    public static Scanner scn = new Scanner(System.in);
  public static void main(String args[]){
      System.out.println("enter value");
      int numberOfLine = scn.nextInt();
    //   numberPattern();
      printNumber(numberOfLine); 
  }
 
  public static void printNumber(int numberOfLine){
      for(int i=1;i<=numberOfLine;i++){
      numberPattern();
      System.out.println();

      }
  }
  public static void numberPattern(){
      for(int i= 1;i<=5;i++){
          System.out.print(i +" ");
      }
  }

}