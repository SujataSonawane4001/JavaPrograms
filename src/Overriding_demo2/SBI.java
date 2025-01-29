package Overriding_demo2;

public class SBI extends RBI {
	
	@Override
	public void RateofInterest() {
		System.out.println("14.18%");
	}
	
	@Override
	public void Tenure() {
		System.out.println("Minimum 5 years");
	}

}
