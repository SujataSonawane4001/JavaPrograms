package Finalkeywordpractise;

import java.util.Iterator;

public class BlankFinalVraible {

	public static void main(String[] args) {
		final int arr1[] = { 1, 2, 3, 4, 5 };

		
        // Declaring normal integer array
        int arr2[] = { 10, 20, 30, 40, 50 };

        // Assigning values to each other
        arr2 = arr1;
     //   arr1 = arr2; //referencing

        // Now iterating over normal integer array
        for (int i = 0; i < arr2.length; i++)

            // Printing the elements of above array
           System.out.println(arr2[i]);
		
//		int[]x= {1,2,3};
//		x=new int[]{5,6,7}; //this is valid
//
//		final int[]x= {1,2,3};
//		x=new int[]{5,6,7}; //not valid
	}
    }
	
//final we are bound not to refer to another object but within
//the object data can be changed which means we can change the 
//state of the object but not reference.

