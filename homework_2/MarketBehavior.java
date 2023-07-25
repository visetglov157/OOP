package homework_2;

public interface MarketBehavior {
    void acceptToMarket(buyer actor);
    void releaseFromMarket(buyer actor);
    void update();
}
