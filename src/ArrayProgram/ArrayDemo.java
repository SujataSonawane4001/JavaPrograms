package ArrayProgram;

public class ArrayDemo {

	int[] x= {10,20,30,40,50,60,91};  //Using Literal
	
	byte[] z= {1,11,23,98};  //Ok
	//byte[] z= {1,11,23,98,780}; //byte=-128 to 127
	char[] ch= {'a','x','z','p'};
	//char[] ch= {'a','x','z',65}; //by default all numeric con  //97 67 89 98
	int[] p= {}; //0 size array
	
	int[] y=new int[6];               //using new keyword   
	int[] y1=new int[8]; 
	int[] q=new int['a'];
}



//Array : Arrays are sequential arragements of elements
//Drawbacks: We can store same type of elements in array
//                 Arrays have fixed size,Arrays cannot increase and decrease at runtime.
//                 Arrays are homogenous data type


//1.Using Literal(Constant):
//  <data type>[] <ref_var_name>={ele1,ele2,ele3....elen};

//2.Using New Keyword:
//  <data type>[] <ref_var_name>=new <datatype>[size];