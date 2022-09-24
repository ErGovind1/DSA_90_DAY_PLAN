package Auguest27;

// import javax.sql.rowset.spi.SyncResolver;

public class Testdemo {
    void test(){
        System.out.println("this is first class");
    }

}
class test1 extends Testdemo{

    void multiplication(){
        System.out.println("this is multiplication function");
    }
     public static void main(String args[]){
        Testdemo ref = new Testdemo();
                // ref.test();
        //   ref.multiplication();
          test1 tt = new test1();
           tt.multiplication();
           tt.test();

     }
}
