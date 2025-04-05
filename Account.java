public class Account {
    private int accNum;
    private double balance;
    private String dateCreated;

    /* Constructor */
    public Account(int accNum, double balance, String dateCreated) {
        this.accNum = accNum;
        this.balance = balance;
        this.dateCreated = dateCreated;
    }

    /* Getters */
    public int getAccNum() {
        return accNum;
    }

    public double getBalance() {
        return balance;
    }

    public String getDateCreated() {
        return dateCreated;
    }

    /* Setters */
    public void setAccNum(int accNum) {
        this.accNum = accNum;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setDateCreated(String dateCreated) {
        this.dateCreated = dateCreated;
    }

    /* Methods */
    public void deposit(double amount) {
        balance += amount;
    }

    public boolean withdrawal(double amount) {
        if (amount > this.balance) {
            return false;
        } else { 
            this.balance -= amount;
            return true;
        }
    }

    




    

    
}
