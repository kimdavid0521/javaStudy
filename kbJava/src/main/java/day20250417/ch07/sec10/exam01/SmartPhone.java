package day20250417.ch07.sec10.exam01;

public class SmartPhone extends Phone{

    SmartPhone(String owner) {
        super(owner);
    }

    @Override
    void turnOn() {

    }

    @Override
    void turnOff() {

    }

    void internetSearch() {
        System.out.println("인터넷 검색을 합니다.");
    }
}
