package day20250510.ch18.sec10;

import lombok.Getter;

import java.io.Serializable;

@Getter
public class Member implements Serializable {
    private String id;
    private String name;
    public Member(String id, String name) {
        this.id = id;
        this.name = name;
    }
    @Override
    public String toString() { return id + ": " + name; }
}