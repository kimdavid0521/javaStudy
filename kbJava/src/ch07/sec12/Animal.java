package ch07.sec12;

public class Animal {
    // 다른 패키지여도 상속관계면 사용 가능
    protected String name;

    public void sound() {
        System.out.println("Animal sound");
    }

}
