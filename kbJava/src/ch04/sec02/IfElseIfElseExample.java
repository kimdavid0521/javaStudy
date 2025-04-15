package ch04.sec02;

public class IfElseIfElseExample {
    public static void main(String[] args) {
        int score = 75;

        if(score > 0 && score <69) {
            System.out.println("점수가 0~69점입니다.");
            System.out.println("등급은 D입니다");
        }
        else if (score > 70 && score < 79) {
            System.out.println("점수가 70~79점입니다.");
            System.out.println("등급은 C입니다");
        }
        else if (score > 80 && score < 89) {
            System.out.println("점수가 70~79점입니다.");
            System.out.println("등급은 C입니다");
        }
        else if (score > 90 && score < 100) {
            System.out.println("점수가 70~79점입니다.");
            System.out.println("등급은 C입니다");
        }
    }
}
