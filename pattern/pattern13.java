public class pattern13 {
    public static void main(String args[]){
        printNum();
        printSameNum();
        System.out.println("--------------------------");
        StarPrint();

    }
    public static void printNum(){
        for(int i =1;i<=5;i++){


            for(int k=1;k<=5-i;k++){

                System.out.print(" ");
            }


            for(int j=1;j<=i;j++){

                System.out.print(j);
            }
            System.out.println();
        }
        System.out.println("--------------------------");
    }
    public static void printSameNum(){
        for(int i =1;i<=5;i++){
            for(int k =1;k<=5-i;k++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }

    public static void  StarPrint(){
        for(int i=1;i<=5;i++){

            for(int j=1;j<=5-i;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }


}
