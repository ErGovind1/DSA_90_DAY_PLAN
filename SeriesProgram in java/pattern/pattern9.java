import javax.sql.rowset.spi.SyncResolver;

public class pattern9 {
    public static void main(String args[]){
        evenPattern();
      System.out.println("........................");
      patternEven();
      System.out.println("........................");
      StarPattern();

    }
    public static void evenPattern(){
        for(int i=1;i<=4;i++){
            for(int j=1;j<=2*i;j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
   public static void patternEven(){
    for(int i=4;i>=1;i--){
        for(int j=1;j<=2*i;j++){
            System.out.print(j+" ");
        }
        System.out.println();
    }
   }
   public static void StarPattern(){
      for(int i=1;i<=5;i++){

        for(int j=1;j<=2*i;j++){
            System.out.print("*"+" ");
        }
        System.out.println();
      }
   }

}
