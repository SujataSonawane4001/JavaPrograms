package VariableDemo;

public class Demo_static {
	static int x=45;
	public static void main(String[] args) {
		Demo_static obj1=new Demo_static();
		Demo_static obj2=new Demo_static();
		obj1.x=obj1.x+5; //45+5=50
      System.out.println(obj2.x);
	}

}


//static Variable
//Write at class level
//It also called static
//Store in Metaspace
//belong to class
//Static-->Single copy
