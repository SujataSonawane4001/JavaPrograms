package Singleinheritance;

public class Deposit extends Bank {

	
	double amt=456.3;
	
	public void depositamt() {
		avlbal=avlbal+amt; 
        System.out.println("total balance after depositing"+avlbal);
	}
	

}


//avlbal=avlbal-amt; 