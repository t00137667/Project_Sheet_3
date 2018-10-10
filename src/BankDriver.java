public class BankDriver {
    public static void main(String[] args) {
        SavingsAccount savingsAccount = new SavingsAccount();

        savingsAccount.lodge(50);

        System.out.println(savingsAccount.getBalance());
    }
}
