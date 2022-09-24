package Auguest_26;

abstract class vechile {
    abstract void start();
    abstract void addition();
}
class car extends vechile{
    void start(){
        System.out.println("car start with key");
    }

}
class scooter extends vechile{
    void start(){
        System.out.println("scooter start with kick");
    }
    public static void main(String args[]){
        // vechile v = new vechile();
        //     v.start();
          car c = new car();
          c.start();
          scooter s = new scooter();
          s.start();
          add a = new add();
          a.addition();  
        
    }
}

class add extends vechile{
     void addition(){
       int a=5;
       int b=6;
       System.out.println(a+b);
     }
}
