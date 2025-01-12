package Constructordemo;

public class AddConstructordemo {
	public AddConstructordemo() {
		this(100,200);
		System.out.println("first constructor");
	}
	
    public AddConstructordemo(int i,int j) {
		this(23.5,10,36);
		System.out.println("second constructor");
	}
    
    public AddConstructordemo(double d,int i,int k) {
		System.out.println(d+i);
		System.out.println("third constructor");
	}
	public static void main(String[] args) {
		AddConstructordemo a=new AddConstructordemo();

	}

}
