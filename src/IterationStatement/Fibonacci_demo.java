package IterationStatement;

import java.util.Scanner;

public class Fibonacci_demo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number upto");
		int n=sc.nextInt();  //end 5
		int num1=0;
		int num2=1;
		System.out.print(num1+" ");
		System.out.print(num2);
		int i=1; //start
		while(i<=n) { //2<=5 3<=5 4<=5
			
			int result=num1+num2;  // result=1  0+1  // 1+1 result=2 //1+2 result=3 //2+3 result=5
			num1=num2;   //num1=1 num2=?  //num1=1  num2?  //num1=2 num2=? //num1=3 num2=?
			num2=result;  //num2=1 result=? //num2=2 result=? //num2=3 result=? //num2=5 result=?
			i++; //3 //4 //5
			System.out.print(" "+result);
		}
	}
}
 //     num1 num2 result
//0      1   1      2 3 5 8 13 21




