package Method_recursion;

public class Recurse_program {
	
    private void printhello() {  //recursion //instance method
		System.out.println("Hello");
		printhello();

	}
	public static void main(String[] args) {
		Recurse_program r=new Recurse_program();
		System.out.println("s");
		r.printhello();

	}

}
