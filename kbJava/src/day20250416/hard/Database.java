package day20250416.hard;

public class Database {

    private String connection = "MySQL";

    //static으로 자기 자신을 담을 인스턴스 선언
    private static Database instance = new Database();

    // private 생성자 (외부에서 new 못함)
    private Database() {}

    //인스턴스를 외부에서 가져가는 메서드
    public static Database getInstance() {
        return instance;
    }

    // 연결 메서드
    public String connect() {
        System.out.println(connection + "에 연결합니다.");
        return connection;
    }

    // 닫기 메서드
    public void close() {
        System.out.println("데이터베이스: " + connection);
        System.out.println(connection + "을 닫습니다.");
    }
}
