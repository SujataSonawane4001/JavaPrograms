package Encapsulation_demo;

import java.util.Scanner;

public class User {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//set-->1
		ATM account=new ATM();
		account.setAccountnumber("568925");
		account.setBalance(620);
		account.setPin(2301);
		
		//set-->2
		ATM vinita=new ATM();
		vinita.setAccountnumber("56836");
		vinita.setBalance(62000);
		vinita.setPin(2503);
		
		System.out.println("enter atm pin");
		int enteredpin=sc.nextInt();
		
		if(vinita.authenticatePin(enteredpin)) {
			System.out.println("login succesful :");
			System.out.println("account number :"+vinita.getAccountnumber());
			System.out.println("account balance :"+vinita.getBalance());
		}else {
			System.out.println("entered invalid pin");
		}
		//get
//		System.out.println("enter atm pin");
//		int enteredpin=sc.nextInt();
//		
//		if(account.authenticatePin(enteredpin)) {
//			System.out.println("login succesful :");
//			System.out.println("account number :"+account.getAccountnumber());
//			System.out.println("account balance :"+account.getBalance());
//		}else {
//			System.out.println("entered invalid pin");
//		}

	}

}
