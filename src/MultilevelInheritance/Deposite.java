package MultilevelInheritance;

public class Deposite extends Bank {
	

	double amt=456.3;
	
	public void depositamt() {
		avlbal=avlbal+amt; 
        System.out.println("total balance after depositing "+avlbal);
	}

}
