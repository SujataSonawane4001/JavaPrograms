package IterationStatement;

public class foreach_demo {

	public static void main(String[] args) {
		int[] x= {15,24,58,75,86,36};
		int sum=0;
		for(int marks:x) {
			sum +=marks;
		}
		System.out.println(sum);
	}

}
