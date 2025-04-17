//import java.util.ArrayDeque;
//import java.util.Queue;
//import java.util.Scanner;
//import java.util.Stack;
//
//public class javacodingTest {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt(); // 줄 갯수
//        sc.nextLine(); // 숫자 입력받고 개행 소비
//
//
//        for (int i = 0; i < n; i++) {
//            String line = sc.nextLine();
//
//            // 입력받은 문자열을 배열로 전환
//            char[] charArray = line.toCharArray();
//
//            int length = line.length();
//
//            Queue<String> queue = new ArrayDeque<>();
//            queue.add(String.valueOf(charArray[0]));
//
//            for (int j = 1; j < length; j++) {
//                queue.add(String.valueOf(charArray[j]));
//                if (charArray[j] == queue.peek()) {
//                    queue
//                }
//
//            }
//
//        }
//
//
//
//    }
//}
