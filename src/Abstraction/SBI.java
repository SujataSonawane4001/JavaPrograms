package Abstraction;

public class SBI extends RBI {

	@Override
	public void openAccount(String Adharnum, String pan) {
		System.out.println("Open account in SBI");
		
	}
	public static void main(String[] args) {
		SBI s=new SBI();
		s.m1();
	}
	

}
