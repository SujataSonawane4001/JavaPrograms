package Hierarchicalinheritance;

public class Transaction {

	public static void main(String[] args) {
		Withdrawl w=new Withdrawl();
		w.details();
		w.Withdrwalamt();
		
		Deposite d=new Deposite();
		d.details();
		d.depositamt();
		

	}

}
