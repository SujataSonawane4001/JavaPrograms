package ArrayProgram;

public class NumberOccurance {

	public static void main(String[] args) {
		int[] x= {15,24,58,75,58,36,58};
		
		int num=58; 
		int count=0;
		for (int i = 0; i < x.length; i++) {
			if(num==x[i]) {
				count++;
			}
		}
		System.out.println(count);

	}

}
