public class BankDriver {
    public static void main(String[] args) {
        SavingsAccount savingsAccount = new SavingsAccount();

        savingsAccount.lodge(50);

        System.out.println(savingsAccount.getBalance());

        savingsAccount.withdraw(25);

        System.out.println(savingsAccount.getBalance());

        savingsAccount.calcTax(savingsAccount.getBalance());

        System.out.println(savingsAccount.calcTax(savingsAccount.getBalance()));

        SavingsAccount newAccount = new SavingsAccount(750, "John Doe", 1234);

        System.out.println(newAccount.toString());

        System.out.println();
    }
}
