package Method_recursion;

public class Recursion_helloworld {
	int count=0;
	
	private void printhello() {
		
         System.out.println("hello_"+count);
         if(count<15) { //1<15
        	 count++; //2
        	 printhello();
         }
         
	}

	public static void main(String[] args) {
		Recursion_helloworld r=new Recursion_helloworld();
		r.printhello();

	}

}
