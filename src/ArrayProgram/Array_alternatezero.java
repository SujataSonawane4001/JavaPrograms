package ArrayProgram;

public class Array_alternatezero {

	public static void main(String[] args) {
		//{0,0,0,0,0,1,2,3,4,5}-->original array
		//{1,0,2,0,3,0,4,0,5,0}---op
		
		int[] arr = {0,1,3,4,0,0,6,0};
		int n = arr.length;
		int[] result = new int[n];
		int index = 0;
		for (int i = 0; i < arr.length; i++) {  //1//2//3//4//5//6//7//8
			if (arr[i] != 0) {  //6!=0
				result[index] = arr[i]; //r[6]=6
				index++;  //7
				if (index < n) {  //7<8
					result[index] = 0; //rs[7]=0
					index++; //6//8
				}
			}
		}
		for (int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}
//		for (int num : result) {
//			System.out.print(num + " ");
//		}
	}
}


