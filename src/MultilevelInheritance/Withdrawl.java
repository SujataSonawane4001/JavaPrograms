package MultilevelInheritance;

public class Withdrawl extends Deposite {
	
	
     double amt=200;
	
	public void Withdrwalamt() {
		avlbal=avlbal-amt; 
        System.out.println("total balance after withdrwal "+avlbal);
	}

}
