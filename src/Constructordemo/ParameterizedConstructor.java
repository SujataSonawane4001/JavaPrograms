package Constructordemo;

public class ParameterizedConstructor {

	String name;
	int age;
	String address;
	
	public ParameterizedConstructor(String name,int age,String address) {
		this.name=name;  //variable
		this.age=age;
		this.address=address;
	}
	
	public void display() {
		System.out.println("name "+name);
		System.out.println("age "+age);
		System.out.println("address "+address);
	}
	
	public static void main(String[] args) {
		ParameterizedConstructor p=new ParameterizedConstructor("Ketan",25,"aaaaa");
        p.display();
         ParameterizedConstructor p1=new ParameterizedConstructor("Smita",23,"bbbbb");
        p1.display();
	}

}
