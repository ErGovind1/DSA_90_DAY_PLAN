public class reversePattern{
    public static void main(String args[]){
        // singleLine(1);
        reverse(6);
    }
    public static void singleLine(int numberOfStars){
        for(int i=1;i<=numberOfStars;i++){
            System.out.print("*");
        }
    }
    public static void reverse( int numberofLine){
        for(int i=numberofLine;i>=1;i--){
            System.out.print("*");  
        }
        System.out.println();
    }
}