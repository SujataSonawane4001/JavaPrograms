package Tricky_interviewquest;

import java.util.Scanner;

public class Intv3 {
   private static int changevalue(int x) {
	    x=20;
        System.out.println("changevalue"+x);
        return x;
     }
	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
//		System.out.println("enter number");
//		int number=sc.nextInt();
		int x=30;
		System.out.println("before :"+x);
		
		System.out.println(changevalue(x));
		
		
		System.out.println("after :"+x);

	}

}
