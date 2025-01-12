package ArrayProgram;

public class Removeduplicate {

	public static void main(String[] args) {
		int[] x= {1,2,2,3,4,5,6,7,8,11,11,12};
		int i=0;
		for (int j = 1; j < x.length; j++) {
			if(x[i]!=x[j]) {
				i++;
				x[i]=x[j];
			}
		}
		for (int j = 0; j < x.length; j++) {
			System.out.println(x[i]);
		}
	}

}
