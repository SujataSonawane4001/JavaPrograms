package ArrayProgram;

public class ArrayLeadingelement {

	public static void main(String[] args) {
		int[] arr= {15,0,24,64,0,0,8,9};
         int n=arr.length;
         int index=n-1;
         int[] result=new int[n];
         
         for (int i = n-1; i >=0; i--) {
			if(arr[i]!=0) {
				result[index]=arr[i];
				index--;
			}
		  }
         for (int i = 0; i < result.length; i++) {
			System.out.print(result[i]+" ");
		}
//         for (int i = 0; i < n; i++) {
//			arr[i]=result[i];
//		}
//         for (int i = 0; i < arr.length; i++) {
//			System.out.println(arr[i]);
//		}
	}

}
