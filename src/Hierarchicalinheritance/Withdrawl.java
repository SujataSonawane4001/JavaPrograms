package Hierarchicalinheritance;

public class Withdrawl extends Bank {
	
	 double amt=200;
		
		public void Withdrwalamt() {
			avlbal=avlbal-amt; 
	        System.out.println("total balance after withdrwal "+avlbal);
		}

}
