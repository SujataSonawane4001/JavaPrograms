package ArrayProgram;

public class ArrayTest {
	//static int[] x= {67,68,98,44,32,11,21};  //instance
	public static void main(String[] args) {
		int[] x= {67,68,98,44,32,11,21}; 
		int index=0;
		while(index<=x.length-1) {  //0<=6  0<=7-1 0<=6
			System.out.println(x[index]);
			index++;
		}
	}

}
