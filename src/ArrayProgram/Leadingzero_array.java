package ArrayProgram;

public class Leadingzero_array {

	public static void main(String[] args) {
		int[] arr= {15,0,24,64,0,0,8,9}; //8
		int n=arr.length;
		int index=n-1; //7
		int[] result=new int[n];
		
		for (int i = n-1; i >=0; i--) { //i=7 //6//5 //4//3//2//1//0
			if(arr[i]!=0) {  //arr[0]->15!=0
				result[index]=arr[i]; //result[3]=arr[0] -->result[3]=15
				index--;//6//5//4//3
			}
			
		}
		//[7]->9//[6]->8//[5]->64//[4]->24//[3]->15//3
		for (int i = 0; i < result.length; i++) {
			System.out.print(result[i]+" ");
		}
	}
}

//Assignment
//input  int[]x={0,0,0,0,0,1,2,3,4,5};
//output [1, 0, 2, 0, 3, 0, 4, 0, 5, 0] 