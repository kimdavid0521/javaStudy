package day20250423.ch12.sec03.exam02;

import java.util.Objects;

public class Student {
    private int no;
    private String name;

    // 생성자
    public Student(int no, String name) {
        this.no = no;
        this.name = name;
    }

    public int getNo() {
        return no;
    }

    public String getName() {
        return name;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Student target)) return false;
        return no == target.no && Objects.equals(name, target.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(no, name);
    }

    @Override
    public String toString() {
        return "Student{no=" + no + ", name='" + name + "'}";
    }
}
