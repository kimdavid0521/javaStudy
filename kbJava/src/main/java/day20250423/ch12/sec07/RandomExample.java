package day20250423.ch12.sec07;

import java.util.*;

public class RandomExample {
    public static void main(String[] args) {
        Random random = new Random();

        Set<Integer> myNumberSet = new HashSet<>();
        Set<Integer> winningNumberSet = new HashSet<>();

        while (myNumberSet.size() < 6) {
            myNumberSet.add(random.nextInt(45) + 1);
        }

        while (winningNumberSet.size() < 6) {
            winningNumberSet.add(random.nextInt(45) + 1);
        }

        List<Integer> myNumbers = new ArrayList<>(myNumberSet);
        List<Integer> winningNumbers = new ArrayList<>(winningNumberSet);

        Collections.sort(myNumbers);
        Collections.sort(winningNumbers);


        System.out.println("선택한 번호: " + myNumbers);
        System.out.println("당첨 번호: " + winningNumbers);


        if (myNumbers.equals(winningNumbers)) {
            System.out.println("당첨");
        } else {
            System.out.println("당첨 실패");
        }
    }

    }


