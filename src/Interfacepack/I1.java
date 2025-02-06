package Interfacepack;

public interface I1  {
	
	void m1();
	void m2();
	
	// static int i=90;
	
	
	//void m2();
//	void m3();
//	void m4();
//	
//	public static void main(String[] args) {
//		
//	}
//	 default void m3() {  //1.8 version update//default concrete method
//		 System.out.println("testing");
//	 }
//	 
	 public static void m4() {
		 System.out.println("hello");
	 }
	 
	public static void main(String[] args) {
		I1.m4();
	}
	 	
	
	
	
	

}


//by using interface we can achieve 100% abstraction
//by default all methods of interface are abstract
//In interface concrete method is not allowed
//we cannot create object of interface
//blocks are also not allowed in interfaces
//Interfaces can be implemented not to be extended
//by deafault all variables in interfaces are public,staic final
//we cannot write constructor in interfaces

//class-->class-->extends
//interface--->class-->implemnts
//class-->interface-->implemnts
//interface-->interface-->extends
