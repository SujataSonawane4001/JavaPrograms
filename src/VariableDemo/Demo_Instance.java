package VariableDemo;

public class Demo_Instance {
    int b=10; //non static field
	public static void main(String[] args) {
		Demo_Instance obj1=new Demo_Instance();
		Demo_Instance obj2=new Demo_Instance();
		obj1.b=obj1.b+5;
		obj2.b=obj2.b+15;
		System.out.println(obj1.b);
		System.out.println(obj2.b);
     
	}

}


//Instance Variable
//Write at class level
//It also called non-static
//Store in heap memory
//belong to object
//Instance-->multiple copies

