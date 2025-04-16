package programmersJava.ch06.sec07.exam03;

public class Korean {
    // 필드 선언
    String nation = "대한민국";
    String name;
    String ssn;
    // 생성자 선언
    public Korean(String name, String ssn) {
        // 생성자에서 필드 초기화
        this.name = name;
        this.ssn = ssn;
    }
}