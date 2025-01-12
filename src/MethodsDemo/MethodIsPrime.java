package MethodsDemo;

import java.util.Scanner;

public class MethodIsPrime {
    public Boolean IsPrime(int num) {
    	int count=1;
    	for (int i = 2; i < num; i++) {
			if(num%i==0) {
				count++;
			}
		}
    	if(count>2) {
    		System.out.println("number is not prime "+ num);
    		return false;
    		
    	}else {
    		System.out.println("number is  prime "+ num);
    		return true;
    	}

	}
    private void m1() {
		// TODO Auto-generated method stub

	}
	public static void main(String[] args) {
		MethodIsPrime m=new MethodIsPrime();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int number=sc.nextInt();
	    boolean b=m.IsPrime(number);
		System.out.println(b);

	}

}
