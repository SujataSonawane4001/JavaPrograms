package AccessModifiersDemo;

public class Ademoc {
//     public void m1() {
//	  System.out.println("m1 method");
//
//     }
	
	 protected void m2() {
		System.out.println("m2 method");

	   }
     
	public static void main(String[] args) {
		Ademoc a=new Ademoc();
		a.m2();

	}

}

//access modifiers : public,private ,protected,default
// public :  anyone can access in entire project
// private : it can access only within class
//default :  it can access only same package
//protected : Protected members can be called inside same package or in a child class if it is in another package.