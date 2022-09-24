import java.util.Scanner;

public class cheakPrime {
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter a Number");
        int num = scn.nextInt();
         printPrime(num);
    }

    public static void printPrime(int num){
        int count=0;
        for(int i=2;i<num;i++){
            if(num%2==0){
                count++;
                break;

            }
        }
        if(count==0)
        System.out.println("prime number");
        else
        System.out.println("Not a prime");
        return;
    }

}
