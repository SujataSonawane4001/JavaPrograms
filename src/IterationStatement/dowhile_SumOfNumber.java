package IterationStatement;

import java.util.Scanner;

public class dowhile_SumOfNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		int num=sc.nextInt();
		int i=1;
		int sum=0;
		do {
			sum=sum+i;  //sum=0+1 sum=1 //
			i++; //i=i+1
		}while(i<=num);
        System.out.println("sum of number :"+sum);
	}

}
//1 to 5 1+2+3+4+5=15