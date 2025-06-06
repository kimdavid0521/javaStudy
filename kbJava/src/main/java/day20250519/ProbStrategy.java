//package day20250519;
//
//import java.util.Random;
//
//public class ProbStrategy implements Strategy{
//    private Random random;
//    private int prevHandValue = 0;
//    private int currentValue = 0;
//    private int[][] history = {
//            {1, 1, 1,},
//            {1, 1, 1,},
//            {1, 1, 1,},
//    };
//
//    public ProbStrategy(int seed) {
//        random = new Random(seed);
//    }
//
//    @Override
//    public Hand nextHand() {
//        int bet = random.nextInt(getSum(currentHandValue));
//        int handvalue = 0;
//        if(bet < history[currentHandValue][0]) {
//            handvalue = 0;
//        } else if(bet < history[currentHandValue][0] + history[currentHandValue][1]) {
//            handvalue = 1;
//        } else {
//            handvalue = 2;
//        }
//                prevHandValue = currentHandValue;
//                currentHandValue = handvalue;
//                return Hand. getHand (handvalue) ;
//    }
//
//    @Override
//    public void study(boolean win) {
//        if (win) {
//            history[prevHandValue][currentValue]++;
//        } else {
//            history[prevHandValue][(currentValue + 1) %3]++;
//            history[prevHandValue][(currentValue + 2) %3]++;
//        }
//    }
//}
