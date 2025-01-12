package AccessModifiersDemo;

public class Democlass_acc {
    //  public int x=10;   //instance variable
    //  public static int y=10; //static variable
      
   //	private int x=10; //instance variable
   //	private static int y=10;  //static variable
	
  //	int x=10;   //instance variable
  //	static int y=20; //static variable
	
	protected int x=10;   //instance variable
	protected static int y=10; //static variable
      
	public static void main(String[] args) {
		// int x=10;   //local variable

	}
	protected class demom{  //inner class
    	
    }
}


//inner class- inner class is a class that written inside a class
//Local variables can't be access using modifiers
//public : method,class,variable
//Private : method,variable,Inner class
//default : method,class,variable
//protected : method,varaible,Inner class
