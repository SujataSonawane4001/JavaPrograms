package Constructordemo;

public class Constructoroverload {
	public Constructoroverload() {
		//this(25);
		this(65,56);
		System.out.println("testing shastra");
		
	}
    public Constructoroverload(int x) {
		
	}
    public Constructoroverload(int x,int y) {
		
	}
    public Constructoroverload(int x,int y,String nm,float marks) {
		
	}
    
	
	
	private void m1(int x) {
		//this();

	}
	

	public static void main(String[] args) {
		Constructoroverload c=new Constructoroverload();
       c.m1(23);
	}

}
