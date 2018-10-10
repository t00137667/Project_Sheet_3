public class SavingsAccount extends BankAccount {
    private double balance;

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public SavingsAccount(){
        setBalance(500);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public void lodge(double a) {
        super.lodge(a);
    }
}
