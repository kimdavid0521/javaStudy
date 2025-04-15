package Hard20250415;

import java.util.Scanner;

public class score {
    public static void main(String[] args) {
        int[] arr = null;
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("------------------------");
            System.out.println("1.학생수 2.점수입력 3.점수 리스트 4.분석 5.종료");
            System.out.println("------------------------");
            System.out.print("선택> ");
            int k = scanner.nextInt();

            switch (k) {
                case 1:
                    System.out.print("학생수> ");
                    int m = scanner.nextInt();
                    arr = new int[m];
                    break;

                case 2:
                    if (arr == null) {
                        System.out.println("학생수를 먼저 입력하세요!");
                        break;
                    }
                    for (int i = 0; i < arr.length; i++) {
                        System.out.print("scores[" + i + "] = ");
                        arr[i] = scanner.nextInt();
                    }
                    break;

                case 3:
                    if (arr == null) {
                        System.out.println("학생수를 먼저 입력하세요!");
                        break;
                    }
                    System.out.println("점수 리스트:");
                    for (int i = 0; i < arr.length; i++) {
                        System.out.println("scores[" + i + "] = " + arr[i]);
                    }
                    break;

                case 4:
                    if (arr == null) {
                        System.out.println("학생수를 먼저 입력하세요!");
                        break;
                    }
                    int maxScore = 0;
                    int sum = 0;
                    for (int i = 0; i < arr.length; i++) {
                        if (arr[i] > maxScore) {
                            maxScore = arr[i];
                        }
                        sum += arr[i];
                    }
                    System.out.println("최고 점수: " + maxScore);
                    System.out.println("평균 점수: " + (double) sum / arr.length);
                    break;

                case 5:
                    System.out.println("프로그램 종료!");
                    return;

                default:
                    System.out.println("잘못된 입력입니다.");
            }
        }
    }
}
