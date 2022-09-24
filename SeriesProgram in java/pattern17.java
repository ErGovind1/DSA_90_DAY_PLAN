public class pattern17 {
    public static void main(String args[]){
        DiamondPattern();
    }

    public static void DiamondPattern(){
        for(int i =1;i<=5;i++){
            for(int j=1;j<=5;j++){
                if((i+j==4)||(i-j==2)||(j-i==2)||(i+j==8)){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
         }
                                                                                                                                 }                                                                                                                                                                                                                                                                                  
        
    }
}

