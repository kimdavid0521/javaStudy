package programmersJava.ch06.sec07.exam04;

public class Car {
    //필드 선언
    String company = "현대자동차";
    String model;
    String color;
    int maxSpeed;

    // 매개변수가 없는 생성자
    public Car() {
    }

    // model만 받는 생성자
    public Car(String model) {
        this.model = model;
    }

    // model과 color를 받는 생성자
    public Car(String model, String color) {
        this.model = model;
        this.color = color;
    }

    // model, color, maxSpeed를 받는 생성자
    public Car(String model, String color, int maxSpeed) {
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }
}