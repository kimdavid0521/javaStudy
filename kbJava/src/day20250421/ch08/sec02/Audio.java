package day20250421.ch08.sec02;

public class Audio implements RemoteControl{
    @Override
    public void turnOn() {
        System.out.println("Audio를 킵니다.");
    }
}
