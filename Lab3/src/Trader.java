public class Trader {
    private static String name;
    private static double account;

    Account tradeAccount = new Account();

    public void addTrade(double price, int quantity){
        this.account = price * quantity;
        tradeAccount.setTotalTrade(this.account);
    }
}