package ControlStatement_demo;

import java.util.Scanner;

public class Ternaryoper_demo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number1");
     	int num1=sc.nextInt();
     	System.out.println("enter number2");
     	int num2=sc.nextInt();
     	System.out.println("enter number3");
     	int num3=sc.nextInt();
     	  // 23 36  46                  T       T
       if(num1>num2 && num1>num3) { //23>36 && 23>46 
    	   System.out.println("Maximum number"+num1);
       }else if(num2>num1 && num2>num3) {  //23>36(F) && 36>46(F)
    	   System.out.println("Maximum number"+num2);
       }else {
    	   System.out.println("number is "+num3);
       }
	   
//		x = (a>b)? (a > c ? a: c) : (b > c ? b : c);
//    	System.out.println(x);
	    
	    

	}

}
