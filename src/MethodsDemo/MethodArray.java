package MethodsDemo;

public class MethodArray {
    public int arrayDemo(int x[]) {
		int sum=0;
		for (int i = 0; i < x.length; i++) {
			sum=sum+x[i];
		}
		
		return sum;

	}
	public static void main(String[] args) {
		MethodArray m=new MethodArray();
		int[] arr= {23,24,26,28,26,36};
		int result=m.arrayDemo(arr);
		System.out.println(result);
        
	}

}
