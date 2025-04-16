package programmersJava.ch06.sec08.exam02;

public class Computer {

    // 가변인자
    int sum(int... values) {
        int sum = 0;
        for (int i : values) {
            sum = sum +i;
        }
        return sum;
    }




}
