public class Test {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        A_child ac = new A_child();
        ac.f_a();

        B_child bc = new B_child();
        bc.f_a();
        bc.f_b();
    }
}

class A {
    public A () { }                   // 생성자 메소드

    //public void f_a() { }    // 이렇게 추상메소드는 추상클래스에서 사용할 수 없음 > 에러발생
    public void f_b() {               // 일반 메소드로 사용 가능
        System.out.println("class A f_a");
    }
}

class A_child extends A {
    public void f_a() {
        System.out.println("This is A_Child Class f_a");
    }
}

abstract class B {
    public B () { }                   // 생성자 메소드
    abstract void f_a();              // 추상메소드 사용 가능 > 자식클래스에서 무조건 구현해 주어야 함
    public void f_b() {               // 일반 메소드로 사용 가능
        System.out.println("abstract class B f_b");
    }
}

class B_child extends B {
    public void f_a() {
        System.out.println("This is B_Child Class f_a");
    }
}
