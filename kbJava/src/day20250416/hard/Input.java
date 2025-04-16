package day20250416.hard;

import java.util.Scanner;

public class Input {
    private static Scanner scanner = new Scanner(System.in);

    // 문자열 입력
    public static String read(String title) {
        System.out.println(title);
        return scanner.nextLine();
    }

    // 문자열 입력
    public static String read(String title, String defaultValue) {
        System.out.println(title+"(" + defaultValue + ")");
        String input = scanner.nextLine();
        return input.isEmpty() ? defaultValue : input;
    }

    // 정수 입력
    public static int readInt(String title) {
        System.out.print(title);
        while (!scanner.hasNextInt()) {
            System.out.println("유효하지 않은 입력입니다. 정수를 입력해주세요.");
            scanner.next(); // 잘못된 입력을 처리
            System.out.print(title);
        }
        return scanner.nextInt();
    }

    // yes/no 확인
    public static boolean confirm(String title, boolean defaultValue) {
        String defaultText = defaultValue ? "(Y/n)" : "(y/N)";
        System.out.print(title + " " + defaultText + ": ");
        String input = scanner.nextLine().toLowerCase();

        if (input.isEmpty()) {
            return defaultValue;
        } else if (input.equals("y") || input.equals("yes")) {
            return true;
        } else if (input.equals("n") || input.equals("no")) {
            return false;
        } else {
            System.out.println("잘못된 입력입니다. 기본값을 사용합니다.");
            return defaultValue;
        }
    }

    // yes/no 확인 (기본값이 없는 경우)
    public static boolean confirm(String title) {
        return confirm(title, true);
    }

    // Scanner 객체를 닫는 메서드
    public static void close() {
        if (scanner != null) {
            scanner.close();
        }
    }

}
