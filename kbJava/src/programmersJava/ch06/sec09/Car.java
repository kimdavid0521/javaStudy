package programmersJava.ch06.sec09;

public class Car {
    // 필드 선언
    String model;
    int speed;

    // 생성자로 model 초기화
    public Car(String model) {
        this.model = model;
    }

    // speed의 getter
    public int getSpeed() {
        return speed;
    }

    // speed의 setter
    public void setSpeed(int speed) {
        this.speed = speed;
    }

    // run 메서드
    public void run() {
        System.out.println(model + "가 달립니다. (시속: " + speed + "km/h)");
    }
}
