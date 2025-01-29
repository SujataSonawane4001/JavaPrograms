package Overriding_demo;

public class Driver {

	public static void main(String[] args) {
		Parents p=new Parents();
		p.car();
		p.carname();
		Son s=new Son();
		s.car();
		s.carname();
		Daughter d=new Daughter();
		d.car();
		d.carname();

	}

}
