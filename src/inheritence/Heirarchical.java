package inheritence;

public class Heirarchical {

    public static void main(String[] args) {
        B b = new B();
        b.show1();
        C c = new C();
        c.show2();
        D d = new D();
        d.show3();
    }
}

class A {
    int a = 10;
}

class B extends A {
    public void show1() {
        System.out.println(a);
    }
}

class C extends A {
    public void show2() {
        System.out.println(a);
    }
}

class D extends A {
    public void show3() {
        System.out.println(a);
    }
}
