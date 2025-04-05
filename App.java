public class App {
    public static void main(String[] args) throws Exception {
        SavingsAccount s1 = new SavingsAccount(12345, 2000, null);
        CurrentAccount a1 = new CurrentAccount(372910, 327189, null);

        //For Savings
        System.out.printf("Savings Acccount %d Balance: %.2f", s1.getAccNum(), s1.getBalance());

        System.out.printf("\nTransaction: Deposit RM100.00");
        s1.deposit(100);
        System.out.printf("\nSavings Account %d Updated Balance %.2f", s1.getAccNum(), s1.getBalance());

        System.out.printf("\nTransaction: Withdrawal RM 500.00");
        s1.withdrawal(500);
        System.out.printf("\nSavings Acccount %d Updated Balance: %.2f", s1.getAccNum(), s1.getBalance());

        //For Current
        System.out.printf("\n\nCurrent Acccount %d Balance: %.2f", a1.getAccNum(), a1.getBalance());
        System.out.printf("\nTransaction: Deposit RM100.00");
        a1.deposit(100);
        System.out.printf("\nCurrent Account %d Updated Balance %.2f", a1.getAccNum(), a1.getBalance());

        System.out.printf("\nTransaction: Withdrawal RM 500.00");
        a1.withdrawal(500);
        System.out.printf("\nCurrent Acccount %d Updated Balance: %.2f", a1.getAccNum(), a1.getBalance());
    }
}
