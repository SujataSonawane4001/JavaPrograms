package IterationStatement;

import java.util.Scanner;

public class PrintEven1to100 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number"); 
		int num=sc.nextInt();  //50
		int result=0;
		for (int i = 1; i <= num; i++) {  //1 //2<=50 //3<=50 //4<=50 //5<=50 //6<=50
			if(i%2!=0) {  // 1%2 //2%2 //3%2 //4%2 //5%2 //6%2
				result=result+i; //result=0+2=2 //result=2+4=6 //result=6+6=12
			}
			
		}
        System.out.println(result); 
	}

}
