import java.util.Scanner;

public class sum6 {
    public static void main(String args[]){
       Scanner scn = new Scanner(System.in);
        System.out.println("Enter Number");
        int n= scn.nextInt();
        int x=scn.nextInt();
        double sum=0;
        for(int i=1,a=9;i<=n;i++,a+=4){
            sum=sum+(double)Math.pow(a, x);
            System.out.println(sum);
          
        }
    }
}
