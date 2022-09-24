public class pattern19 {
    public static void main(String args[]){
       printPryamid(); 
       System.out.println("------------------------------");
       PrintHeart();
    }
    public static void printPryamid(){
        for(int i=0;i<=3;i++){

            for(int j=0;j<=6;j++){
             if((i+j==3)||(j-i==3)||(i==3&&j%2==0)){
                System.out.print("*");
             }
             else{
               System.out.print(" ");
             }
            }
            System.out.println();
        }
    }

    public static void PrintHeart(){
        for(int i =0;i<=5;i++){
            for(int j =0;j<=6;j++){
                if((i==0&&j%3!=0)||(i==1&&j%3==0)||(i-j==2)||(i+j==8)){
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
