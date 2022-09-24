package Auguest_26;



 class test {
  int i ;// instance veriable

  void setVaule(int i){ //local variable
    this.i=i;
  }
  void show(){
    System.out.println(i);
  }

}
class xyz{
    public static void main(String args[]){
        test t = new test();
          t.setVaule(40);
          t.show();
    }
}
