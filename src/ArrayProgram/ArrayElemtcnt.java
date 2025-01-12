package ArrayProgram;

public class ArrayElemtcnt {

	public static void main(String[] args) {
		int[] arr= {4,2,8,9,1,6,9,20,28};
//		if(arr.length==0) {
//			System.out.println("Empty");
//		}
//		else {
//			System.out.println(arr[0]);
//		}
		for (int i = 0; i < arr.length; i++) {
			arr[i]++;
		}
		System.out.println("array elements");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

	}

}
