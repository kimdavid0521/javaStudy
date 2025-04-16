package day20250416.hard;

public class DatabaseExample {
    public static void main(String[] args) {
        // Database 싱글톤 인스턴스 호출
        Database db = Database.getInstance();

        // MySQL에 연결
        db.connect();

        // MySQL 종료
        db.close();
    }
}
