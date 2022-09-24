package ArithmeticSeries;

import java.util.Scanner;

public class sum4 {
    public static void main(String args[]){
        Scanner snn = new Scanner(System.in);
        System.out.print("Enter number");
        int n;
        // n=snn.nextInt();
       DreaseSum(10); 

    }
    public static void DreaseSum(int n){
        int  sum=0;
        for(int i=1, a=10;i<=n;i++,a--){
          sum=sum+a;
          System.out.println(sum);
             
        }
    }
    
}
