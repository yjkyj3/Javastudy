public class ex19 {
    public static final int MIN_BALANCE = 0;
    public static final int MAX_BALANCE = 1000000;
    private int balance;

    public int getBalance(){
        return balance;
    }

    public void setBalance(int balance) {
        if(balance<ex19.MIN_BALANCE||
        balance>ex19.MAX_BALANCE){
            return;
        }
        this.balance = balance;
    }

}
