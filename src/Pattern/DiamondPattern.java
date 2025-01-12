package Pattern;

import java.util.Scanner;

public class DiamondPattern {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		int num=sc.nextInt();
		for (int line = 1; line <=num; line++) {
			for (int space = num-1; space>=line; space--) {
				System.out.print(" ");
			}
			for (int ast = 1; ast <=line; ast++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		for (int line1 = 1; line1<num ; line1++) {
			for (int space1 = 1; space1<=line1; space1++) {
				System.out.print(" ");
			}
			for (int ast1 = num-1; ast1 >=line1; ast1--) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}

//enter number
//
//6
//     * 
//    * * 
//   * * * 
//  * * * * 
// * * * * * 
//* * * * * * 
// * * * * * 
//  * * * * 
//   * * * 
//    * * 
//     * 

