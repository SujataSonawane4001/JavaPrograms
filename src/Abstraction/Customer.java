package Abstraction;

public class Customer {

	public static void main(String[] args) {
		SBI s=new SBI();
		s.openAccount("22", "33");
		AXIS a=new AXIS();
		a.openAccount("36", "69");
		HDFC h=new HDFC();
		h.openAccount("33", "22");
		s.m1();
		
		//RBI r=new RBI(); //cannot create object
	

	}

}
