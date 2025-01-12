package Constructordemo;

public class Noargconstructor {

	String name;
	int age;
	
	public Noargconstructor() { //no-arg constructor
		name="Geeta";
		age=26;
	}
	public static void main(String[] args) {
		Noargconstructor c=new Noargconstructor();
        System.out.println(c.name);
        System.out.println(c.age);
        Noargconstructor c1=new Noargconstructor();
        System.out.println(c1.name);
        System.out.println(c1.age);
	}

}
