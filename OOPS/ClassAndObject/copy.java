package ClassAndObject;

// class t {
//     t(obj ref){
                        //copy constructor syntax 
//     }
// }
class copy {
  int a ;
  String b;
  copy(){ // 0 parameter
    a=200; b = "excellent conding";
  }
 copy(copy ref){ // 0 parameter
     a = ref.a;
     b= ref.b;

 }
 void see(){
    System.out.println(a+"  "+b);
 }
 

}
class result{
    public static void main(String args[]){
       copy r = new copy();
       copy r2 = new copy(r);
         r.see();
    }
}


