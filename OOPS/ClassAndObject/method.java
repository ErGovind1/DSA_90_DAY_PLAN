package ClassAndObject;

public class method {
//     // By using method
//     String color;
//     int height;
//    void obj(String c , int h){
//         color =c;
//         height =h;
//     }
//     void Display(){
//        System.out.print(color+" "+height);
//     }
//     public static void main(String args[]){
//      method m1 = new method();
//      m1.obj("black",50);
//           m1.Display();
//     }
//    By using method
   String name;
   String color;
   int age ;
   int height;

   void dog(String a, String b, int c, double d){
        name = a;
        color = b;
        age = c;
        height =(int)d;

   }
    
   void Display(){
       System.out.println(name+" "+color+" "+age+" "+height);
   }

   public static void main(String args[]){
         method m = new method();
         
         m.dog("govind","Face white",20,5);
         m.Display();

   }

}
