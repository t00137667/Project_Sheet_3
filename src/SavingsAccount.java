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

    public SavingsAccount(double balance, String name, int accNum){
        setBalance(balance);
        setName(name);
        setAccNum(accNum);
    }

    @Override
    public String toString() {
        //return "\nName: " + getName() + "\nBalance: " + getBalance() + "\nAccount Number: " + getAccNum();
        return super.toString() + "\nBalance: " + getBalance();
    }

    @Override
    public void lodge(double a){
        setBalance(getBalance() + a);
    }

    public void withdraw(double a){
        setBalance(getBalance()- a);
    }

    public double calcTax(double a){
            return 0.0;
    }
}
