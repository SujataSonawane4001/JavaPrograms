package IterationStatement;

import java.util.Scanner;

public class DoWhile_fibonacci {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
			System.out.println("Enter the number");	
			int n=sc.nextInt();
		 int num1=0;
		 int num2=1;
		 int sum=0;
		 int i=1;
		 System.out.print(num1+ " "+num2);
		 do {
			 sum=num1+num2;
			 num1=num2;
			 num2=sum;
			 System.out.print(" "+sum);
			 i++;
		 }while(i<=n);
	}
}


/// i++ + ++j - --i
