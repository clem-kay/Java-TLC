public abstract class Trade {
    private static String ID;
    private static String symbol;
    private static int quantity;
    private static double price;

    public Trade(String ID, String symbol, int quantity, double price) {
        this.ID = ID;
        this.symbol = symbol;
        this.quantity = quantity;
        this.price = price;
    }

    public String toString(){
        return "ID"+ID+"Symbol"+symbol+"Quantity"+quantity+"Price"+price;
    }

    public Trade(){

    }

    public static void setPrice(double price) {
        if (price > 0)
            Trade.price = price;
    }
    public void setTrade(String ID, String symbol,int quantity){
        this.ID = ID;
        this.symbol = symbol;
        this.quantity = quantity;
    }

    public static double getPrice() {
        return price;
    }

    public abstract void calcDividend();
}