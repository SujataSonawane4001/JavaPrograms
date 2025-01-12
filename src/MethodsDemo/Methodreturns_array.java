package MethodsDemo;

public class Methodreturns_array {
    public int[] add(int[] arr) {
    	for(int i=arr.length-1;i>=0;i--) {
			System.out.println(arr[i]);	
	}
      int[] b= {1,2,3};
      return b;
	}
	public static void main(String[] args) {
		Methodreturns_array m=new Methodreturns_array();
		int[] arr= {23,24,26,28,26,36};
		int[] result=m.add(arr);
	    System.out.println(result);
		for (int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}

	}
}
