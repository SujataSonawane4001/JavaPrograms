package ArrayProgram;

public class FisrtLastSWap {

	public static void main(String[] args) {
		int[] arr= {4,2,8,9,1,6,7,10};
		int n=arr.length;
        int temp=arr[0];
        arr[0]=arr[n-1];
        arr[n-1]=temp;
        System.out.println("array elements");
        for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

}
