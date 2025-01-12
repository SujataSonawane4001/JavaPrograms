package ArrayProgram;

public class MAxNumber {

	public static void main(String[] args) {
		int[] x= {15,24,58,75,86,36};
		int max=x[0];
		for (int i = 0; i < x.length; i++) {
			if(max<x[i]) {
				max=x[i];
			}
		}
		System.out.println(max);
		
		
//		int[] x= {15,24,58,75,86,36};
//		int min=x[0];
//		for (int i = 0; i < x.length; i++) {
//			if(min<x[i]) {
//				min=x[i];
//			}
//		}
//		System.out.println(min);
	}

}
