package day20250422.ch09.sec02.exam01;

public class A {
    class B {}

    B filed = new B();

    A() {
        B b = new B();
    }

    void method() {
        B b = new B();
    }
}
