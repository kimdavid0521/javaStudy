package day20250423.ch11.sec06;

import day20250422.ch09.sec02.exam02.A;

public class AccountExample {
    public static void main(String[] args) {
        Account account = new Account();

        account.deposit(10000);
        System.out.println("예금액: " + account.getBalance());

        try {
            account.withdraw(5000);
        } catch (InsufficientException e) {
            String message = e.getMessage();
            System.out.println(message);
        }

        try {
            account.withdraw(7000);
        } catch (InsufficientException e) {
            String message = e.getMessage();
            System.out.println(message);
        }
    }
}
