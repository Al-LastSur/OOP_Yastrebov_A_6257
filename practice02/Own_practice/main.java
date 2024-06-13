package practice02.Own_practice;

public class main {
    public static void main(String[] args) {
        Market market = new Market();
        Actor human1 = new Human("111");
        Actor human2 = new Human("222");
        market.acceptToMarket(human1);
        market.acceptToMarket(human2);
        market.update();
    }
}
