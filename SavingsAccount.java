public class SavingsAccount extends Account {
    private static double interestRate = 0.05;

    public SavingsAccount(int accNum, double balance, String dateCreated) {
        super(accNum, balance, dateCreated);
    }

    public double calInterest() {
        return getBalance() * (interestRate / 12);
    }

    public void addInterest() {
        double interestEarned = calInterest();
        super.deposit(interestEarned);
    }
}
