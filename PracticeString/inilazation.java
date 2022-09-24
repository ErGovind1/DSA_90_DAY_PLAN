package PracticeString;
public class inilazation{
  public static void main(String[] args) {
    String first = "Govind";
    String last= "Pandit";
    String fullName = first +" "+last;
    System.out.println(fullName.length());
        
    for(int i =0;i<=fullName.length()-1;i++){
    System.out.print(fullName.charAt(i));
    }
    
  }
}