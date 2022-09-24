package ArithmeticSeries;

import java.util.Scanner;

public class sum3 {
    public static void main(String args[]){
        Scanner r = new Scanner(System.in);
        System.out.print("Enter Number");
        int n = r.nextInt();
        // for(int i=2;i<=n;i+=2){
        //     sum=sum+i;
        //     System.out.println(sum);
        // }
        // for(int i=1,a=2;i<=n;i++,a+=2){
        //    sum=sum+a;
        //    System.out.println(sum);
        // }
        sum(n);

    }

    public static void sum(int n){
          int sum=0;

        for(int i=1,a=2;i<=n;i++,a+=2){
            sum=sum+a;
            System.out.println(sum);
         } 
    }
    
}
