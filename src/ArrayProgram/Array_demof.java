package ArrayProgram;

import java.util.Scanner;

public class Array_demof {

	public static void main(String[] args) {
	//	int[] x= {11,22,56,78,45,21,23,29}; //8
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the size of an array");
	int size=sc.nextInt(); //8
	System.out.println("Enter the elements array");
	int[] x=new int[size];
	for (int i = 0; i < x.length; i++) {
		x[i]=sc.nextInt();
	}
	System.out.println("Array Elements");
	for (int i = 0; i < x.length; i++) {
		System.out.println(x[i]);
	}
	
	
	
		
		
		
		
//		for (int i = 0; i < x.length; i++) {  // even or odd
//			if(x[i]%2 != 0) {
//				System.out.println("odd number"+x[i]);
//			}
//		}
//		
		
		
		
//		for (int index = 0; index <= x.length-1; index++) {
//			System.out.println(x[index]);
//		}
		
//		for (int index = x.length-1; index >= 0; index--) {    //Reverse array
//			System.out.println(x[index]);
//		}
		
		//int[] x= {1,3,6,4,5,2}; //21
//		int sum=0;
//		for (int i = 0; i < x.length; i++) {                   //Sum of array
//			sum=sum+x[i];
//		}
//		System.out.println(sum);
		
		

	}

}
