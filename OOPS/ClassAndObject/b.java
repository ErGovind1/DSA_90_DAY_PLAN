package ClassAndObject;

class b {
    int a;
    String b;
    boolean c;

    b() {
        a = 30;
        b = "Binod";
        c = true;
        System.out.println(a + " " + b + " " + c);

    }

    void Display() {
        System.out.println(
                "my name is radhe , i am from bihar, my education backgraound is that i completed my B.tech computer sciece engineering form punjab technical university and my hobbies is that reading book and playing cricket ,read newspater and free time other activity like playing game and movie my weakness is that i am very emmotional ,my strong point i'm very honest");
    }

}

class C {

    C() {
        System.out.print("Constructor");
    }

    public static void main(String args[]) {
        b ref = new b();
        ref.Display();
        C r = new C();

    }
}
