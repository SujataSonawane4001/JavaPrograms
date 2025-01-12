package Tricky_interviewquest;

public class Intv2 {

	public static void main(String[] args) {
		//System.out.println(10+20+"30"+40);
		 int x=5;   //6
		 int y=10;           //      F || T
		 if(x++>5 || ++y>10) { // (5>5) || (11>10)
			 x++; //7
		 }
		 System.out.print("x= "+x+",y= "+y);
		

	}

}
