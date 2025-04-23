package day20250417.ch07.sec08.exam01;

public class CarExample {
    public static void main(String[] args) {
        Car myCar = new Car();

        myCar.tire = new Tire();
        myCar.run(); // 회전 합니다 출력

        myCar.tire = new HankookTire();
        myCar.run(); // 한국 타이어가 회전합니다 출력

        myCar.tire = new KumhoTire();
        myCar.run(); // 금호 타이어가 회전합니다 출력
    }
}
