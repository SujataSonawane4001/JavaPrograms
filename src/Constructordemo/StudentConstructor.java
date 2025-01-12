package Constructordemo;

public class StudentConstructor {
	
	String name; //instance 
	int rollnumber;
	float marks;
	//final static String institute="Testing Shastra"; //final-->constant //satic->single copy
	
	public StudentConstructor(String name,int rollnumber,float marks) {
		this.name=name; //variable
		this.marks=marks;
		this.rollnumber=rollnumber;
	}
	public void m1() { //instance methods
		System.out.println("hii i am m1 method");

	}
	public void m2() { //instance methods
		System.out.println("Hi i am m2 method");
        this.m1();
        m3();
        
	}
	public static void m3() {
		

	}

	public static void main(String[] args) {
		StudentConstructor s=new StudentConstructor("Madhura",25,89.36f);
         s.m1();
         m3();
	}

}
//static context->static method or static block