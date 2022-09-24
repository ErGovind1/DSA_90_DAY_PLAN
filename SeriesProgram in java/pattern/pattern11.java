public class pattern11 {
    public static void main(String args[]){
        evenReverse();
        System.out.println("-------------------------");
        EqualReverseNum();
        System.out.println("-------------------------");
        ReverseStar();

        
    }

    public static void evenReverse(){
        for(int i=4;i>=1;i--){
            for(int j = 1;j<=2*i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    public static void EqualReverseNum(){
        for(int i=4;i>=1;i--){
            for(int j =1;j<=2*i;j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
    public static void ReverseStar(){
        for(int i = 4;i>=1;i--){
            for(int j=1;j<=2*i;j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
}
