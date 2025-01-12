package MethodsDemo;

import java.util.Scanner;

public class Pattern_abc {
    private static void pattern1(int n) {
    	for (int line = 1; line <=n; line++) {
			for (int space = n-1; space >= line; space--) {
				System.out.print(" ");
			}
			for (int ast = 1; ast <=line; ast++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		int number=sc.nextInt();
		pattern1(number);
		

	}

}
