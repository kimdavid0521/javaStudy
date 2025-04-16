package day20250416.ch06.sec14;

public class Car {

    // 필드 선언
    private int speed;
    private boolean stop;

    public Car() {

    }

    public Car(int speed, boolean stop) {
        this.speed = speed;
        this.stop = stop;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isStop() {
        return stop;
    }

    public void setStop(boolean stop) {
        this.stop = stop;
    }
}
