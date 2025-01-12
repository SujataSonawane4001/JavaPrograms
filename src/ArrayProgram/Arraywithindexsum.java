package ArrayProgram;

import java.util.Scanner;

public class Arraywithindexsum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[] arr={10,20,30,45,85,79};
		System.out.println("all elements");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		System.out.println("Enter the index number");
		int index=sc.nextInt();
		int sum=0;
		for (int i = 0; i <= index; i++) {
			sum =sum + arr[i];
			
		}
		System.out.println(sum);

	}

}
