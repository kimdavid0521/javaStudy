package day20250422.ch09.sec07.exam03;

public class ButtonExample {
    public static void main(String[] args) {
        Button btnOk = new Button();

        //ok 버튼 객체에 ClickListener 구현 객체 주입
        btnOk.setClickListener(new Button.ClickListener() {
            @Override
            public void onClick() {
                System.out.println("OK 버튼을 클릭했습니다");
            }
        });

        btnOk.click();
    }
}
