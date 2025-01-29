package Abstraction;

public abstract class demo1 {  //concrete class
	
	int x;  //instance var
	static int y;  //staic var
//	final int x;
//	int y;
	public demo1(int x, int y) {  //parameterized constructor
		System.out.println("");
		 this.x=x;
		 this.y=y;
	}
	
	static{
		System.out.println("instance ");
		{
			System.out.println("local ");
		}
	}
	
	public  void m1() {  //concrete 
		System.out.println("Hii i am method");
        int j=6;  //local var
	}
	
	public void m1(int x) {  //concrete
		// TODO Auto-generated method stub

	}
	
	abstract void m3();  //abstract method
	public abstract void m4();  //abstract method
	public abstract void m5();  //abstract method
	
	
	
	
}



//0 to 100% abstraction
//Abstraction achieved-->abstract class,interface
//abstract method doesn't have body
//Hiding backround details & showing necessary information
//Creating method as abstract and allowing to child to create their taste(own choices)
//var--> instance,static,local
//bloack-->instance,static,local
//methods-->abstract-->no static & final
//          Concrete->static & final
//access modifiers-->public ,protected,default