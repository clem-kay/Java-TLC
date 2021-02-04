public class Account{
    private double totalTrade;

    public double getTotalTrade() {
        return totalTrade;
    }

    public void setTotalTrade(double account) {
        this.totalTrade = this.totalTrade + account;
    }
}