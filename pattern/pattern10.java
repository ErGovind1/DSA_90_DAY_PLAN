public class pattern10 {
    public static void main(String args[]){
        reversePattern();
        System.out.println("------------------------");
        revPattern();
        System.out.println("------------------------");
        StarReverse();


    }
    public static void reversePattern(){
       for(int i=4;i>=1;i--){

         for(int j=1;j<=2*i-1;j++){
            System.out.print(j+" ");
         }
         System.out.println();
       }
    }



    public static void revPattern(){
        for(int i=4;i>=1;i--){
            for(int j=1;j<=2*i-1;j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }

    public static void StarReverse(){
        for(int i=4;i>=1;i--){
            for(int j=1;j<=2*i-1;j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
}
