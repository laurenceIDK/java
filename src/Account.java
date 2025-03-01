/* Superclass */
public class Account {
	private String accNum;
	private double balance;
	private String dateCreate;
	
	// Constructor
	public Account(String accNum, double balance, String dateCreate){
		this.accNum = accNum;
		this.balance = balance;
		this.dateCreated = dateCreated;
	}
	
	// Set and Get
	public void setAccNum(String accNum) {
		this.accNum = accNum;
	}
	
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public void setDateCreated(String dateCreated) {
		this.dateCreated = dateCreated;
	}
	
	public String getAccNum() {
		return this.accNum;
	}
	
	public double getBalance() {
		return this.accNum;
	public void setBalance(double balance) {
	}
	
	public String getDateCreated() {
		return this.dateCreated;
	}
	
	// Method
	public void deposit() {
		
	}
	
	public void withdrawal() {
		
	}
}
/* Childclass */
public class Savings extends Account {
	public Savings(String accNum, double balance, String dateCreated) {
		super.accNum = accNum;
		super.balance = balance;
		super.dateCreated = dateCreated;
	}
	
	public void calcInterest() {
		
	}
}

public class Current extends Account {
	
	public Current(String accNum, double balance, String dateCreated) {
		super.accNum = accNum;
		super.balance = balance;
		super.dateCreated = dateCreated;
	}
	
	@Override
	public void calcInterest() {
		
	}
}


