public class pattern12 {
    public static void main(String args[]){
        PrintAlpha();
    }
    public static void PrintAlpha(){
        for(int i =1;i<=5;i++){
            for(int j =1;j<=i;j++){
                // int ch = 'a'+j-1;
                System.out.print((char)(96+i)+" ");
            }
            System.out.println();
        }
        System.out.println("----------------------");

        for(int i=5;i>=1;i--){
            for(int j=1;j<=i;j++){
            System.out.print((char)(96+i)+" ");
            }
            System.out.println();
        }
    }
}
