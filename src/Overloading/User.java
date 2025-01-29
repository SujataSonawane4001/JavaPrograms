package Overloading;

public class User {

	public static void main(String[] args) {
		Calculator c=new Calculator();
		c.add(2.4, 3.6);  //compile time error
		//c.add(2.6, 8.6, 3.5);

	}

}
