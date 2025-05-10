package day20250510.ch18.sec10;

import lombok.Getter;

import java.io.Serializable;

@Getter
public class Product implements Serializable {
    private String name;
    private int price;
    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }
    @Override
    public String toString() { return name + ": " + price; }
}