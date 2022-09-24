import java.util.Scanner;

public class sum5 {
    public static Scanner scn= new Scanner(System.in);
    public static void main(String args[]){
        System.out.print("Enter number");
        int n= scn.nextInt();
        int x= scn.nextInt();
        double sum=0;
        for(int i=1 ,a=1;i<=n;i++,a++){
        sum=sum+ (double)Math.pow(x, a);    
           System.out.println(sum);
        }

    }
    // public static void sumOfSquare(int n){
    //     double sum=0;
    //     for(int i=1 ,a=1;i<=n;i++,a++){
    //     sum=sum+ (double)Math.pow(y, a);    
    //        System.out.print(sum);
    //     }
    // }
}
