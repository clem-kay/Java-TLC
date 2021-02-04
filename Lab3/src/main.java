public class main {

    public static void main(String[] args) {
        Trader trader = new Trader();

        trader.addTrade(25.9,6);
        trader.tradeAccount.getTotalTrade();
        System.out.println(trader.tradeAccount.getTotalTrade());
        trader.addTrade(25.9,6);
        System.out.println(trader.tradeAccount.getTotalTrade());



        BondTrade bondTrade = new BondTrade();

    }
}
