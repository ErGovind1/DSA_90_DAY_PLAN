package ClassAndObject;

 class A {

    String name;
    int a;

    A(String b){  //Default constructor  //0 parameter
        // System.out.println("this is constructor");
        a=12;  name ="RadheShyam";
       
    } 

    A(int a){
        int s  =a;
        System.out.println(s);
        System.out.println("chanchal");

    }
    void show(){
        System.out.println(a+" "+name);
    } 
    public static void main(String args[]){
        A  ref = new A("goivind");
        A  re = new A(10);

        ref.show();
           
    }
}
