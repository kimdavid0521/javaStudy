package day20250422.ch09.sec06.exam03;

public class ButtonExample1 {
    public static void main(String[] args) {
        Button btnOk = new Button();

        class OkListener implements Button.ClickListener {

            @Override
            public void onClick() {
                System.out.println("OK 버튼을 클릭했습니다.");
            }
        }

        btnOk.setClickListener(new OkListener());

        btnOk.click();
    }
}
