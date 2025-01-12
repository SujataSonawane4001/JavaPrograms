package MethodsDemo;
public class arrayascending {
	public static int[] Arrayascending(int[] a) {
    	int[] b=new int[a.length];
//    	int[] x= {15,24,58,75,86,36}; //15,24,36,58,75,86
		int temp=0;
		for (int i = 0; i < a.length; i++) { 
			for (int j = i+1; j < a.length; j++) { 
				if(a[i]>a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
			//System.out.println(a[i]);
		}
    	int j=0;
    	for (int i =a.length-1 ; i >=0; i--) {
    		b[j]=a[i];
    		j++;
		}
    	return b;
    }
	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5,6};
		int[] revarr=Arrayascending(arr);
           for (int i = 0; i < revarr.length; i++) {
			System.out.println(revarr[i]);
		}
	}
}
