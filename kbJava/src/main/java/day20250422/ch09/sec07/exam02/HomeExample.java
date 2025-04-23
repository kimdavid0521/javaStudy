package day20250422.ch09.sec07.exam02;

public class HomeExample {
    public static void main(String[] args) {

        //home 객체 생성
        Home home = new Home();

        // 익명 구현 객체가 대입된 필드 사용
        home.use1();

        // 익명 구현객체가 대입된 로컬 변수 사용
        // 에어컨 끄고 키기
        // home.use2();
        //익명 구현 객체가 대입된 매개변수 사용
        // 리모콘 객체 만들어서 사용
//        home.use3(new RemoteControl() {
//            @Override
//            public void turnOn() {
//                System.out.println("난방을 켭니다.");
//            }
//            @Override
//            public void turnOff() {
//                System.out.println("난방을 끕니다.");
//            }
//        });
    }
}
