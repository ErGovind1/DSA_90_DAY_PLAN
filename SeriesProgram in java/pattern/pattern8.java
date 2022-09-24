public class pattern8 {
    public static void main(String args[]){
        evenPattern();
    }

    public static void evenPattern(){
        for(int i =1;i<=4;i++){
            for(int j=1;j<=2*i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
