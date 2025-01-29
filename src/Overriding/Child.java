package Overriding;

public class Child extends Parent {
	
	
	
	public String m1(int x, int y) {
		System.out.println("Multiplication");
		return "testing";
	}
	
	

	public static void main(String[] args) {
		Parent p=new Child(); //object 
		    //refer v
		System.out.println(p.m1(6, 7));

	}

}

//jiska object uski method