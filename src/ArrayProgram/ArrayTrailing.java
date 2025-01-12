package ArrayProgram;

public class ArrayTrailing {

	public static void main(String[] args) {
		int[] arr= {12,0,4,8,0,3,0,13};
		int j=0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]==0) {  //arr[i]!=0 -->trailing zero
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				j++;
			}
			
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}
}

//assignment : {13,0,12,0,45,0}
//             {0,0,0,12,4,8,3,13}
