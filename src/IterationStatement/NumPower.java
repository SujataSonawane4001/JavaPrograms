package IterationStatement;

import java.util.Scanner;

public class NumPower {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number"); //base==2
		double num=sc.nextDouble();
		System.out.println("enter the exponent"); //expon=6
		double expo=sc.nextDouble(); //3
		double result=1;  
		for (int i = 1; i <= expo ; i++) { // 1<=3//2<=3//3<=3//4<=3
			result= result*num;// result=1*2 =2 //2*2=4 result=4// 4*2=8
		}
		System.out.println(result);

	}
   
}
