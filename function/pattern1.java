public class pattern1 {
    public static void main(String args[]){
        // for(int i = 1; i<=8;i++){
        //     for(int j =1;j<=8;j++){
        //      System.out.print("* "); 
        //     }
        //    System.out.println();
        // }
        // for(int i=0;i<=10;i++){
        //     singleLine();
        //     System.out.println();
        // }
      Pattern_();
      System.out.println("govind");
      Pattern_();
      System.out.println("Pandit");
      Pattern_();


    }
       public static void Pattern_(){
        for(int i=0;i<=5;i++){
            singleLine();
            System.out.println();
        }
       }
    public static void singleLine(){
        for(int i=0;i<=5;i++){
            System.out.print("* ");
        }
    }
}
