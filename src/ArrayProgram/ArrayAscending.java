package ArrayProgram;

public class ArrayAscending {

	
	public static void main(String[] args) {
		int[] x= {15,24,58,75,86,36}; //15,24,36,58,75,86
		int temp=0;
		for (int i = 0; i < x.length; i++) { 
			for (int j = i+1; j < x.length; j++) { 
				if(x[i]>x[j]) {
					temp=x[i];
					x[i]=x[j];
					x[j]=temp;
				}
			}
			System.out.println(x[i]);
		}
		
	}
}

