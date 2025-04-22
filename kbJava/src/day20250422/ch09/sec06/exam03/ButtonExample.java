package day20250422.ch09.sec06.exam03;

import day20250422.ch09.sec06.exam01.Button;

public class ButtonExample {
    public static void main(String[] args) {
        Button btnOk = new Button();

        //ok 버튼 클릭 이벤트 처리할 ClickListener 구현 클래스
        class OkListener implements Button.ClickListener {

            @Override
            public void onClick() {
                System.out.println("ok 버튼을 클릭했습니다.");
            }
        }

        //ok 버튼 객체에 ClickListener 구현 객체 주입
        btnOk.setClickListener(new OkListener());

        // 버튼 ok 클릭하기
        btnOk.click();
    }
}
