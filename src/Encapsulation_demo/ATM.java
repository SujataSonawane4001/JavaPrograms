package Encapsulation_demo;

public class ATM {
	
	private String accountnumber;
	private double balance;
	private int pin;
	public String getAccountnumber() {
		return accountnumber;
	}
	public double getBalance() {
		return balance;
	}
	public void setAccountnumber(String accountnumber) {
		this.accountnumber = accountnumber;
	}
	
	public void setBalance(double balance) {
		if(balance>=0) {
			this.balance=balance;
		}
		else {
			System.out.println("Inavalid balance so default balance 0");
			this.balance=0;
		}
	}
	public int getPin() {
		return pin;
	}
	public void setPin(int pin) {
		this.pin = pin;
	}
	
	public boolean authenticatePin(int enteredpin) {
		
		return this.pin==enteredpin;

	}

}
