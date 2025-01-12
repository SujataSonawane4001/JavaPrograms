package TypecastingDemo;

public class Implicitype_demo {
	
	public static void main(String[] args) {
		
		char c= 'A';
		int i=c;  //implicit typecasting
		System.out.println(i);
	}

}

//byte<short<int<long


//byte-->short //implicit
//short-->int  //implicit
//int-->short   //Explicit
//long-->int   //Explicit
//long-->byte  //Explicit
//byte-->long   //implicit



//Implicit type-casting
//Smaller data type convert into bigger data type

//Explicit type-casting
//Bigger data type convert into Smaller data type