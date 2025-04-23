package day20250423.ch11.sec06;

public class InsufficientException extends Exception{
    public InsufficientException() {
        super("잔액이 부족합니다.");
    }

    public InsufficientException(String message) {
        super(message);
    }
}
