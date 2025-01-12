package Pattern;

import java.util.Scanner;

public class Pyramid_123 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		int n=sc.nextInt();
		for (int line = 1; line <= n; line++) {  
			for (int space = n-1; space >=line; space--) {
				System.out.print(" "); 
			}
			
			 int num=1; 
			for (int ast = 1; ast <=line; ast++) { 
				if(line==1 || line==2 || ast==1 || line==ast || line==n) { 
					System.out.print("* ");
				}
				else {
					System.out.print(num+" ");
					num++;
				}
					
			}
			System.out.println();
		}

	}

}


//enter number
//6
//     * 
//    * * 
//   * 1 * 
//  * 1 2 * 
// * 1 2 3 * 
//* * * * * * 
