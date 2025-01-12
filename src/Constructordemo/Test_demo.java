package Constructordemo;

public class Test_demo {

	private void m1() { //instance method
		System.out.println("shraddha");

	}
	public Test_demo() { //no-arg constructor
		
	}
   public Test_demo(int x,int z) { //parameterizd constructor
		
	}
   
	
	public static void main(String[] args) {
	
		Test_demo c=new Test_demo();
		c.m1();
	   
	}

}

//doesn't have return type
//special type method
//instance variable
//same as class name 