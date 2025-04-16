package programmersJava.ch06.sec09;

// car 테스트 클래스
public class CarExample {
    public static void main(String[] args) {
        Car myCar = new Car("그랜저");

        myCar.setSpeed(80);

        myCar.run();

        System.out.println("현재 속도: " + myCar.getSpeed() + "km/h");
    }



}
