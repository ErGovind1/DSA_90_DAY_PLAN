public class pattern14 {
    public static void main(String args[]){
        // printXpattern();
        System.out.println("---------------------------------");
        corssPattern();
    }
    public static void printXpattern(){
        for(int i = 1;i<=9;i++){
            for(int j=1;j<=9;j++){
                if(i==j||(i+j==10)){
                    System.out.print(i);
                }
                else{
                    System.out.print(" ");
                }

            }
            System.out.println();

        }
    }


    public static void corssPattern(){
        for(int i  =1;i<=11;i++){
            for(int j =1;j<=11;j++){
                if(i==j||i+j==12){
                    System.out.print(i);
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
