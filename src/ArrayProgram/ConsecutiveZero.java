package ArrayProgram;

public class ConsecutiveZero {
   //{12,23,56,2}
	//{12,0,23,0,56,0,2,0}
	public static void main(String[] args) {
		int[] oldarr= {12,23,56,2};
		int[] newarr=new int[oldarr.length*2];
		int j=0;
		for (int i = 0; i < oldarr.length; i++) {
			newarr[j]=oldarr[i]; //n[0]=12 //n[2]=23 //
			newarr[j+1]=0; //n[1]=0; //[3]=0
			j=j+2; // j=0+2 //2 //j=2+2=4
		}
		System.out.println("new array");
		for (int i = 0; i < newarr.length; i++) {
			System.out.print(newarr[i]+" ");
		}

	}

}
