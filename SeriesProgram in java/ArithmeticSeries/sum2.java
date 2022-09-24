package ArithmeticSeries;

import java.util.Scanner;

public class sum2 {
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        System.out.print("enter number:");
        int n = scn.nextInt();
        int sum=0;
        for(int i=1, a=9;i<=n;i++,a+=4){
            sum = sum+a;
            System.out.println(sum);
        }
    }
}
