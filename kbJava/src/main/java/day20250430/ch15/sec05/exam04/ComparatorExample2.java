package day20250430.ch15.sec05.exam04;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ComparatorExample2 {
    public static void main(String[] args) {
        ArrayList<Fruit> fruitList = new ArrayList<>();

        fruitList.add(new Fruit("포도", 3000));
        fruitList.add(new Fruit("수박", 10000));
        fruitList.add(new Fruit("딸기", 5000));

        Collections.sort(fruitList, new Comparator<Fruit>() {
            @Override
            public int compare(Fruit o1, Fruit o2) {
                return Integer.compare(o1.price, o2.price);
            }
        });

        for (Fruit fruit : fruitList) {
            System.out.println(fruit.name + ":" + fruit.price);
        }
    }
}
