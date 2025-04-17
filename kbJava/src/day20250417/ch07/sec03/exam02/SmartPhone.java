package day20250417.ch07.sec03.exam02;

public class SmartPhone extends Phone{


    public SmartPhone(String model, String color) {
        // 부모 클래스 생성자 호출
        super(model, color);
        System.out.println("스마트폰 생성자 실행");
    }



}
