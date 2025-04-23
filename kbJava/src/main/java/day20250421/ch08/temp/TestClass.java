package day20250421.ch08.temp;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TestClass {
    public static void main(String[] args) {

        // 인터페이스 이용 시 유지보수성 향상 - 객체 교환
        // ArrayList: 검색 속도 빠름, 중간에 데이터 추가,수정,제거 느림
        List<String> list = new ArrayList<>();

        // 만약 추가 수정할게 많다면 ArrayList 를 LinkedList로 바꿔주면됨
        // LinkedList : 검색 속도 느림, 중간에 데이터 추가, 수정, 제거 빠름
        List<String> list1 = new LinkedList<>();


        // 인터페이스를 쓰는 가장 큰 목적

        // 1. 인터페이스를 상속 받은 객체를 이용하면
        // - 같은 이름의 메서드를 지니고 있다 (오버라이딩 강제화 되어있음)

        // 2. 인터페이스 타입 변수 = new 상속 받은 자식 클래스(); -> 다형성 (업캐스팅: 자식이 부모처럼 변한것처럼 느껴지는 것) + 동적 바인딩
        // 다형성: 하나의 객체가 부모가될때도 있고 자식이 될때도 있음

        // 3. 인터페이스 제공 메서드를 호출
        // (모든 자식 클래스는 인터페이스에서 제공받은 메서드를 가지고 있다!)
        // -> 인터페이스 타입 변수 = new 상속 받은 자식 클래스(); 에서
        // 자식 클래스(A)를 다른 자식 클래스 (B)로 변경할 수 있다.


        list1.add("짬뽕");
        list1.add("짬뽕");
        list1.add("짬뽕");

    }
}
