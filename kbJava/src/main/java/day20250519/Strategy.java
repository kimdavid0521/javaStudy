package day20250519;

public interface Strategy {
    Hand nextHand();
    void study(boolean win);
}
