package Hard20250415;

import java.util.Scanner;

public class Scan {
    public static void main(String[] args) {
        int sum = 0;
        while (true) {
            System.out.println("------------------------");
            System.out.println("1.예금 2.출금 3.잔고 4.종료");
            System.out.println("------------------------");
            System.out.println("선택>");
            Scanner scanner = new Scanner(System.in);
            int k = Integer.parseInt(String.valueOf(scanner.nextInt()));

            switch (k) {
                case 1:
                    System.out.println("예금액>");
                    sum = sum + Integer.parseInt(String.valueOf(scanner.nextInt()));
                    break;

                case 2:
                    System.out.println("출금액>");
                    sum = sum - Integer.parseInt(String.valueOf(scanner.nextInt()));
                    break;

                case 3:
                    System.out.println("잔고>");
                    System.out.println(sum);
                    break;

                case 4:
                    System.out.println("프로그램 종료");
                    return;
            }
        }
    }
}
