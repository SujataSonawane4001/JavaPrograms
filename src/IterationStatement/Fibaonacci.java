package IterationStatement;

import java.util.Scanner;

public class Fibaonacci {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		int num=sc.nextInt();
		int num1=0;
		int num2=1;
		System.out.print(num1+" ");
		System.out.print(num2+" "); //1 to 7
		for (int i = 1; i <= num; i++) {
			int result=num1+num2; //result=0+1 result=1
			num1=num2;  //num1=1 num2=?
			num2=result; //num2=1 rezult=?
			System.out.print(result+" ");
		}

	}

}
