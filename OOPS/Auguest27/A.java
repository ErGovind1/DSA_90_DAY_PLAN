package Auguest27;

 class A { // multilevel interitance
    void eat(){
        System.out.println("this is for eating of fruit");
    }
    
}
class B extends A{ // extemds class a and all the properties in class B

    void happy(){
        System.out.println("i'm so very happy");
    }

}
class C extends B{ // inherit class B each properties in class c
  void strong(){
    System.out.println("this is strong person");
  }
  public static void main(String args[]){
     A r1= new A();
       r1.eat();
    //    r1.happy();
    //    r1.strong();
    //    r1.happy();
    B  r2 = new B();
       r2.eat();
       r2.happy();
    //    r2.strong();
       C  r3 = new C();
        
        r3.happy();
        r3.eat();
        r3.strong();
        

  }

}

