public class pattern16 {
    public static void main(String args[]){
        // PrintV();
        PrintRev();
    }
    public static void PrintV(){
        for(int i=0;i<=3;i++){
            for(int j=0;j<=6;j++){
                if(i+j==3||(j-i==3)){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void PrintRev(){
        for(int i=1;i<=4;i++){
            for(int j=1;j<=8;j++){
                if(i==j||(i+j==8)){
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
