package MethodsDemo;

public class ReverseArray_method {
   public static int[] Revarray(int[] a) {
	    int[] b=new int[a.length];
	    int j=0;
	    for (int i = a.length-1; i >=0; i--) {
	    	
	    //b	System.out.println(a[i]);
      	b[j]=a[i];  //b[0]=a[4]==78 //b[1]==a[3]=89
		j++;    //1
		}
	    
	    return b;

   }
	public static void main(String[] args) {
		int[] arr= {24,15,56,89,78};
		int[] result=Revarray(arr);
		//System.out.println(result);
		for (int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}

	}

}

//int[] x={1,1,1,0,0,0}
