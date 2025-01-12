package Association;

public class Account {
 private String ownerName;
	private double balance;
	
	public Account() {}
	public void add(double amt) {
		this.balance = this.balance + amt; 
	}
	public void deduct(double amt) {
		this.balance = this.balance - amt;
	}
	public double getCurrentBalance() {
		return this.balance;
	}
	public String getOwnerName() {
		return this.ownerName;
	}
	public void setInitailBalance(double balance) {
		this.balance = balance;
	}
	public void setOwnerName(String name) {
		this.ownerName = name;
	}
}
