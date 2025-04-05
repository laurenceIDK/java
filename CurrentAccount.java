public class CurrentAccount extends Account {
    private static int freeTransactions = 2;
    private static double transactionFee = 5.00;
    private int transactionCount;

    /* Constructor */
    public CurrentAccount(int accNum, double balance, String dateCreated) {
        super(accNum, balance, dateCreated);
    }

    /* Getter and Setter */
    public static int getFreeTransactions() {
        return freeTransactions;
    }

    public static void setFreeTransactions(int freeTransactions) {
        CurrentAccount.freeTransactions = freeTransactions;
    }

    public static double getTransactionFee() {
        return transactionFee;
    }

    public static void setTransactionFee(double transactionFee) {
        CurrentAccount.transactionFee = transactionFee;
    }

    public int getTransactionCount() {
        return transactionCount;
    }

    public void setTransactionCount(int transactionCount) {
        this.transactionCount = transactionCount;
    }
    
    /* Methods */
    public void incrementTransactionCount() {
        this.transactionCount++;
    }
}
