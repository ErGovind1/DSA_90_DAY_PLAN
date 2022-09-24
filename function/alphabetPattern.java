public class alphabetPattern {
    public static void main(String args[]){
      Pattern();
    LowerCase();
    System.out.println();
    Pattern();
    LowerCase();



    }
    public static void Pattern(){
        for(int  i =0;i<5;i++){
            printAlphabet();
            System.out.println();
        }
    }
  public static void printAlphabet(){
      for(int i=0;i<26;i++){
          System.out.print((char)('a'+i)+" ");
      }
  }

  public static void LowerCase(){
      for(int i=97;i<=122;i++){
          System.out.print((char) i+"@");
      }
  }

}
