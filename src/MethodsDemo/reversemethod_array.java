package MethodsDemo;

public class reversemethod_array {
    public static int[] ArrayAsc(int[] a) {
    	//int[] b=new int[a.length];
    	int temp=0;
    	for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				if(a[i]>a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
    	return a;
//    	int j=0;
//    	for (int i =a.length-1 ; i >=0; i--) { 
//    		b[j]=a[i];  
//    		j++; 
//		}
//    	return b;
    }
	public static void main(String[] args) {
		int[] arr= {12,26,83,4,5,6};  // x 
		int[] revarr=ArrayAsc(arr);
           for (int i = 0; i < revarr.length; i++) {
			System.out.println(revarr[i]);
		}
	}
}
