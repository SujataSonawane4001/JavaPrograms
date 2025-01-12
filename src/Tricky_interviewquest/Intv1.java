package Tricky_interviewquest;

public class Intv1 {

	public static void main(String[] args) {
		int a=20;
		int b=20;
		int c=30;
		
		//variable=(a>b)?true:false;
		    //    (20<20)?  True      : false
		                                   // true: false
		int result=(a<b)?(a < c ? a:c):(b < c ? b:c); //20
		System.out.println(result);

	}

}
