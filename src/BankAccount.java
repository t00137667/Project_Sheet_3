public abstract class BankAccount implements Taxable, Transactable {
    protected String name;
    protected int accNum;

    //abstract methods
    public abstract void lodge(double a);
    public abstract void withdraw(double a);
    public abstract double calcTax(double a);


    //Getters and Setters
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

    @Override
    public String toString() {
        return "\nAccount Number: " + getAccNum() + "\nName: " + getName();
        //This method seem unnecessary as you cannot make an instance of an abstract class
    }
}
