package day20250417.ch07.sec04.exam01;

public class ComputerExample {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Computer computer = new Computer();

        double r = 10.0;

        System.out.println("원 면적 : " + calculator.areaCircle(r));
        System.out.println("원 면적 (computer): " + computer.areaCircle(r));
    }
}
