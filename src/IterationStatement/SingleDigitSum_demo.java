package IterationStatement;

import java.util.Scanner;

public class SingleDigitSum_demo {

	public static void main(String[] args) {
		   Scanner sc=new Scanner(System.in);
		   System.out.println("Enter a number");
		   int rem,sum=0,sum1,sum2,total=0;
		   int num=sc.nextInt();
		   while(num>0) {
			   rem=num%10;
			   sum=sum+rem;
			   num=num/10;
		   }
         System.out.println("sum of digit : "+sum); //15
         if(sum>9) {  
        	 sum1=sum%10;
        	 sum2=sum/10;
        	 total=sum1+sum2;
         }
         System.out.println("single digit sum :"+total);
	}
	   

}
//1563=15=1+5=6  --> 0 to 9