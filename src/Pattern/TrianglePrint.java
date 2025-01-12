package Pattern;

public class TrianglePrint {

	public static void main(String[] args) {
		for (int line = 1; line <= 5; line++) {  //line=5
			for (int space = 4; space >=line; space--) { //4>=1 //3>=1//2>=1//1>=1//0>=1
				System.out.print(" "); 
			}
			
			  //ast=2
			for (int ast = 1; ast <=line; ast++) { //2<=5
				if(line==1 || ast==1 || line==ast || line==5) { //F || F || F || T
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
					
			}
			System.out.println();
			
		}

	}

}
//- - - -*
//- - -*  *
//- -*  sp  *
//- * sp  sp *
//*  *   *  *  *

//       *
//     *   *
//    *      *
//   *        *
//  *  *  *  *  *
