public abstract class BankAccount implements Taxable, Transactable {
    protected String name;
    protected int accNum;

    SavingsAccount savingsAccount = new SavingsAccount();

    //public abstract void lodge(double a);
    //public abstract void withdraw(double a);

    public void lodge(double a){
         a = savingsAccount.getBalance();

         System.out.print(a);
    }

    public void withdraw(double a){

    }

    public double calcTax(){
        return 0;
    }

    public int getAccNum() {
        return accNum;
    }

    public String getName() {
        return name;
    }

    public void setAccNum(int accNum) {
        this.accNum = accNum;
    }

    public void setName(String name) {
        this.name = name;
    }
}
