public class pattern3 {
    public static void main(String args[]){
    public static scn = new Scanner(System.in);

        int Numberofline = scn.nextInt();
        pattern_(Numberofline);

    }

    public static void pattern_(Numberofline){
        for(int i=1;i<=Numberofline;i++){
         singleLine(Numberofline);
         System.out.println();
               
        }
        
    }

    public static void singleLine(int NumberofStart){
        for(int j =1;j<=NumberofStart;j++){
            System.out.print("* ");
        }
    }
    
}
