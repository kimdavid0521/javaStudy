package day20250422.ch09.sec03.exam02;

public class A {
    //정적 멤버 클래스
    static class B {

        //인스턴스 필드
        int field1 = 1;

        //정적 필드(Java 17부터 허용)
        static int field2 = 2;

        //생성자
        B() {
            System.out.println("B-생성자 실행");
        }

        //인스턴스 메소드
        void method1() {
            System.out.println("B-method1 실행");
        }

        //정적 메소드(Java 17부터 허용)
        static void method2() {
            System.out.println("B-method2 실행");
        }
    }
}