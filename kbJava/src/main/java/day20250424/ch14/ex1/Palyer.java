package day20250424.ch14.ex1;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Synchronized;

import java.util.Random;

@Data
@AllArgsConstructor
public class Palyer implements Runnable{
    private String name;


    // 랜덤 객체 생성
    private final Random random = new Random();


    @Override
    public void run() {
        try {
            int curr = Main.count; // 현재 숫자를 지역변수에 복사

            // 1~2초 대기
            Thread.sleep(random.nextInt(5) * 200+ 1000);

            // sleep 전 후 숫자를 비교
            // -> 달라짐 -> 다른 플레이어가 Main.count를 증가시켰다!
            while (curr != Main.count) {
                Thread.sleep(random.nextInt(5) * 200 + 1000);
                curr = Main.count;
            }

            synchronized (Main.class) {
                int callNumber = ++Main.count;
                System.out.printf("%-10S : %2d \n", name, callNumber);

                if (callNumber == Main.finalNumber) {
                    System.out.println(name + " 벌칙 당첨!!!");
                }
            }


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
