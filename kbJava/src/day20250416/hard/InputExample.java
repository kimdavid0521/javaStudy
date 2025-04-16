package day20250416.hard;

public class InputExample {
    public static void main(String[] args) {gi
        String name = Input.read("이름: ");
        System.out.println("입력값: " + name);

        String defaultName = Input.read("이름(홍길동): ", "홍길동");
        System.out.println("입력값: " + defaultName);

        int age = Input.readInt("나이: ");
        System.out.println("입력값: " + age);

        boolean exit1 = Input.confirm("종료할까요? (Y/n): ");
        System.out.println("입력값: " + exit1);

        boolean exit2 = Input.confirm("종료할까요? (Y/n): ");
        System.out.println("입력값: " + exit2);

        Input.close();
    }
}
