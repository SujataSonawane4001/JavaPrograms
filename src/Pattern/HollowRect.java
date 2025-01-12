package Pattern;

import java.util.Scanner;

public class HollowRect {
    
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		int num=sc.nextInt();                                             //line=2 ast=2
          for (int line = 1; line <=num ; line++) {  
			for (int ast = 1; ast <=num ; ast++) { 
				if(line==1 || line==2 ||line==num-1 ||line==num|| ast==1 || ast==2 || ast==num-1 ||ast==num) { 
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
				
			}
			
			System.out.println();
		}
	}

}
//Enter number

