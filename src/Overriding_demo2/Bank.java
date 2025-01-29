package Overriding_demo2;

public class Bank {

	public static void main(String[] args) {
		RBI r=new RBI();
		r.RateofInterest();
		r.Tenure();
		SBI s=new SBI();
		s.RateofInterest();
		s.Tenure();
		HDFC h=new HDFC();
		h.RateofInterest();
		h.Tenure();
		

	}

}
