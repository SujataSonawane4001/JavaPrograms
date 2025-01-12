package ControlStatement_demo;

import java.util.Scanner;

public class IfElse_char_consonant {
    // vowel or consonant
	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter any character");
         char ch=sc.next().charAt(0);
         if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'|| ch=='A' ||ch=='E' || ch=='I' || ch=='O' || ch=='U' ) {
        	 System.out.println("this is vowel "+ch);
         }
         else {
        	 System.out.println("this is consonant "+ch);
         }
	}

}
