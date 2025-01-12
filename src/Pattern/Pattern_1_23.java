package Pattern;

public class Pattern_1_23 {

	public static void main(String[] args) {
		 int num=1;
		  for (int line = 1; line <=4; line++) {
			  
			  for (int space = 3; space >=line; space--) {
				   System.out.print(" ");
			   }
			 
			  for (int ast = 1; ast <= line; ast++) {
				  System.out.print(num+" "); 
				  num++; 
			  }
			  System.out.println();
			
		 }

	}

}





//     1
//   2   3
//  4  5   6
//7   8  9   10