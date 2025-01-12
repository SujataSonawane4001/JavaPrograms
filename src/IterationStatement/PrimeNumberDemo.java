package IterationStatement;

import java.util.Scanner;

public class PrimeNumberDemo {
    // number is divisible by 1 or itself=prime
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter any number");
		int num=sc.nextInt(); //15
		int count=0;
		 for (int i = 2; i < num; i++) {  //2<15  //3<15 //4<15 //5<15 //6<15 //7<15
			if(num % i==0) { //15%2==0 F //15%3==0 T //15%4==0 F //15%5==0 T //15%6==0 F//
				count++;  //count=1 //count=2 //
				break;
			}
		}
		 if(count==0) {  //count==1
			 System.out.println("this is prime number");
		 }else {
			 System.out.println("this is not prime");
		 }

	}

}
