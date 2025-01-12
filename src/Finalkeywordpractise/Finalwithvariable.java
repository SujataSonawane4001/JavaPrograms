package Finalkeywordpractise;

public class Finalwithvariable {
	
   private final static int x=10;  //static
    final int y=10;    //instance
   private void m1() {
	  final char c='M';  //local variable

   }

	public static void main(String[] args) {
		Finalwithvariable f=new Finalwithvariable();
       
	}

}


//sttaic-->single copy  //final -->constant
//final is keyword which basically indicates that is no more changes are not allowed
//final-->variable,class,methods