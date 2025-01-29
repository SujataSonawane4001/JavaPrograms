package Overriding;

public class Parent {
	
	public Object m1(int x,int y) { //overloading
		System.out.println("hi i am m1 method from parent class");
         return "ss";
	}
	public int m1(int x,int y,int z) { //overloading
		System.out.println("hi i am m1 method from parent class");
         return x+y;
	}
	

}
//Access modifiers
//method signature: method name & list of arguments
//private method-->overload/not override
//static method-->overload/not override--->static beongs to class-->inheritance belongs to obj
//final method-->overload/not override

//Return-type
//non-primitive data types-->co-variant return type