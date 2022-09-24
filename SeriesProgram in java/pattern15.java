public class pattern15 {
    public static void main(String agrgs[]){
        // PatternV();
        // printA();
        Corss();
    }
    public static void PatternV(){
        for(int i =1;i<=4;i++){
            for(int k =1;k<=5-i;k++){
                System.out.print(" ");
            }
            for(int j =1;j<=6;j++){
                if(i+j==3||j-i==3){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }






    public static void printA(){
        for(int i=1;i<=5;i++){
            for(int j=1;j<=5-i;j++){
                System.out.print(" ");

            }
            for(int k=1;k<=2*i-1;k++){
                if(k%2==0){
                    System.out.print("A");
                }
                else{
                     System.out.print("*");
                }
            }
            System.out.println();
        }
    }

    public static void Corss(){
       for(int i =1;i<=5;i++){
        for(int j=1;j<=5;j++){
            if(i==j||(i+j==6)){
                System.out.print("*");
            }
           else{
            System.out.print(" ");
           }
        }
        System.out.println();
       }
    }
}
