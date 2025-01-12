package ArrayProgram;

public class twoDArray {

	public static void main(String[] args) {
		//int[] x= {12,13,14,15}; //Single dimensional
		int[][] x= {{1,2,3},{4,5},{6,7,9}}; //Two dimensional array
		for (int p = 0; p <=2; p++) {
			for (int c = 0; c < x[p].length; c++) {
				System.out.println(x[p][c]);
			}
			System.out.println();
		}
	}

}
