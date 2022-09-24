package ClassAndObject;
//Syntax of parameterized constructor

// class test{
//     int x,y;

//     test(int x,int y){

//     }
// }

 class para {
    int a,b,c;
    para(int x,int y,int z){
        a = x;
        b = y;
        c = z;
    }
    void display(){
       System.out.println(a+" "+b+" "+c); 
    }
}
class test{
       int a;
       int h ;
    test(int age , int height){
        a =age;
        h = height;
        System.out.println(a+" "+h);
    }
    public static void main(String args[]){
         System.out.println("i was happy becuse i have done my work");
         para p = new para(10,100,399);
         p.display();
         test t = new test(30,5);

    }
}
