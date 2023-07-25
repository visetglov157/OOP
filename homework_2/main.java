package homework_2;

public class main {
    public static void main(String[] args) {

        human hm = new human();
        hm.name = "Vladislav";

        market market = new market();

        market.acceptToMarket(hm);
        market.takeInQueue(hm);
        market.giveOrder();
        market.takeOrder();
        market.releaseFromQueue();
        market.releaseFromMarket(hm);
        market.update();

    }
}
