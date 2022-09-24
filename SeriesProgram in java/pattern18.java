public class pattern18 {
    public static void main(String args[]){
        PrintHeart();
    }

    public static void PrintHeart(){
        for(int i =0;i<=4;i++){
            for(int j=0;j<=6;j++){
                if((i-j==1)||(i+j==7)||(i+j==1)||(j-i==4)||(i+j==5)){
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
