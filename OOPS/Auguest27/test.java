package Auguest27;

 class test {

    void mobile(){
        System.out.println("this is mobile for you");
    }
    
}
class B extends test{
    void pen(){
        System.out.println("this is pan for you");
    }

}
class C extends  test{

    void mouse(){
        System.out.println("this is mouuse for you");
    }
    public static void mian(String args[]){
        // test t = new test();
        //    t.mobile();
        // //    t.pen();
        // B r = new B();
        // r.pen();
        // r.mobile();
        // C r1 = new C();
        //    r1.mouse();
        // //    r1.pen();
        //    r1.mobile();
        HappyEngineerDay();
    }
    public static void HappyEngineerDay(){
        for(int i =0;i<=100;i++){
            System.out.println("HAPPYENGINNERDAY");
        }
    }

}
