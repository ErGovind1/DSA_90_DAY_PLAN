package ArithmeticSeries;
import java.util.Scanner;

public class sumOfNnumber{
    public static Scanner scn = new Scanner(System.in);
    public static void main(String args[]){
        System.out.print("Enter Number");
        int n= scn.nextInt();
        int sum =0;
        // for(int i=1;i<=n;i++ ){
        //   sum=sum+i;
        //   System.out.println(sum);
        // }
        sum=n*(n+1)/2;
        System.out.print(sum);

      }

      
     
   

    
}
