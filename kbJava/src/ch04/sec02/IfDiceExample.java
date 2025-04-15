package ch04.sec02;

import java.util.Random;

public class IfDiceExample {
    public static void main(String[] args) {
        Random random = new Random();
        int num = random.nextInt(6) + 1;
        System.out.println(num + "번이 나왔습니다.");
    }
}
