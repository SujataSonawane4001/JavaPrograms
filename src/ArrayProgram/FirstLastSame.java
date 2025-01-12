package ArrayProgram;

public class FirstLastSame {

	public static void main(String[] args) {
		int[] arr= {4,2,8,9,1,6,7,4};
		if(arr[0]==arr[arr.length-1]) {
			System.out.println("same");
		}
		else {
			System.out.println("not same");
		}

	}

}
