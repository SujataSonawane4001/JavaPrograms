package MethodsDemo;
import java.util.Scanner;
public class method_astpyramid {
    public static void pyramid(int n) {
    	for (int line = 1; line <=n; line++) {
			for (int space = n; space >line; space--) {
				System.out.print(" ");
			}
			for (int ast = 1; ast <= line; ast++) {
				System.out.print("* ");
			}
			System.out.println();
		}
    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please Enter Number");
		int number=sc.nextInt();
        pyramid(number);
	}

}
