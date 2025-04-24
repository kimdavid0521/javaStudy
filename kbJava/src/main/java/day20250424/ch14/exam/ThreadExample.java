package day20250424.ch14.exam;

public class ThreadExample {
    public static void main(String[] args) {
        // 심화 1번 실행
        MovieThread movieThread = new MovieThread();
        movieThread.start();

        // 심화 2번 실행
        Runnable music = new MusicRunnable();
        Thread thread = new Thread(music);
        thread.start();
    }
}
