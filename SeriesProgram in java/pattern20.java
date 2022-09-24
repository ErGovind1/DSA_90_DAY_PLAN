public class pattern20 {
    public static void main(String args[]){
        printPlus();
        System.out.println("----------------------------");
        PrintSwastika();
    }

    public static void printPlus(){
        for(int i =0;i<=6;i++){
            for(int j =0;j<=6;j++){
                if((j==3&&j>=0)||(i==3&&i>=0)){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void PrintSwastika(){
        for(int i=0;i<=6;i++){

           for(int j =0;j<=6;j++){
                if((j==3&&j>=0)||(i==3&&i>=0)){
                    System.out.print("*");
                }
                else if((j==0&&i<=2)||(i==0&&j>=4)||(i==6&&j<=2)||(j==6&&i>=4)){
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
