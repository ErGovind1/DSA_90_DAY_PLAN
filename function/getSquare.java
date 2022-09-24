public class getSquare {
    private static int getSquare(int x){
        return x*x;
    }
    public static void main(String agrrs[]){
        for(int i=0;i<=5;i++){
            int result;
            result=getSquare(i);
            System.out.println("the squre of "+i+" is :"+result);
        }
    }
}
