package ClassAndObject;

class B1{
   String name;
   int a;
     B1(){
        a=0; name=null;
        System.out.println("i'm very happy");

     }

     void show(){
      System.out.println(a+" "+name);
     }

}
class B{
  B(int a){ // parametrized costructor
      System.out.println("1");
  }
 B(){
    System.out.println("radhe");
 }
  public static void main(String args[]){
    System.out.println("Govind");
     B1 ref = new B1();
      ref.show();
      B r = new B(10);

  }
}


