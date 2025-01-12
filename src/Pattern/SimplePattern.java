package Pattern;

import java.util.Scanner;

public class SimplePattern {
    
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		int num=sc.nextInt();
		for (int line = 1; line <=num; line++) { 
			for (int space = num-1; space >=line ; space--) {
				 System.out.print(" ");               
			}
			char ch='a';
			for (int ast = 1; ast <=line ; ast++) { 
				System.out.print(ch+" "); 
				  ch++;                    
				                         
			}                           
			                             
			System.out.println();
		}

	}

}

//output


