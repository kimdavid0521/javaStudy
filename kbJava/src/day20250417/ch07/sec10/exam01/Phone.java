package day20250417.ch07.sec10.exam01;

public abstract class Phone {

    String owner;

    Phone(String owner) {
        this.owner = owner;
    }

    abstract void turnOn();

    abstract void turnOff();

}
