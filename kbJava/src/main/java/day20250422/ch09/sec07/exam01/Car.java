package day20250422.ch09.sec07.exam01;

import javax.imageio.plugins.tiff.TIFFImageReadParam;

public class Car {

    private Tire tire1 = new Tire();
    private Tire tire2 = new Tire() {
        @Override
        public void roll() {
            System.out.println("익명 자식 Tire 객체 1이 굴러갑니다.");
        }
    };

    // 메소드
    public void run1() {
        tire1.roll();
        tire2.roll();
    }

    //메소드 (로컬 변수 이용)
    public void run2() {
        // roll() 메서드에서 익명자식 Tire 객체 2가 굴러갑니다 출력
        Tire tire = new Tire() {
            @Override
            public void roll() {
                System.out.println("익명 자식 Tire 객체 2가 굴러갑니다.");
            }
        };
        tire.roll();
    }

    public void run3(Tire tire) {
        tire.roll();
    }


}
