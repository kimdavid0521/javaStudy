package programmersJava.ch06.sec14;

public class CarExample {
    public static void main(String[] args) {
        //객체 생성
        Car myCar = new Car();

        //잘못된 속도(-50)로 변경
        myCar.setSpeed(-50);

        // 잘못된 속도(-50)로 변경
        myCar.setSpeed(-50);
        System.out.println("현재 속도: " + myCar.getSpeed());

        // 올바른 속도로 변경
        myCar.setSpeed(60);
        System.out.println("현재 속도: " + myCar.getSpeed());

        // 멈춤
        myCar.setStop(true);

        // 현재 속도 출력
        System.out.println("현재 속도: " + myCar.getSpeed());

    }
}
