package IterationStatement;

public class IncrementDemo {

	public static void main(String[] args) {
		int i=5;
		int j=6; // i=5   j=6   
		//int k= i++ + --i;  //5 + 5 
		//int k= i++ + j++;  //5 + 6
		//int k= i++ + ++j + i++ + i++; // 5 + 7 =12 + 6 =18+7
		//int k =i++ + ++j + ++i;
		int k= i++ + ++j + --j - i--;  //5+7=12+6=18-6=12
		
		System.out.println(k); //12
		System.out.println(i); //5
		System.out.println(j); //6

	}

}
