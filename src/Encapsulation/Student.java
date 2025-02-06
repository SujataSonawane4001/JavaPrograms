package Encapsulation;

public class Student {
	
	private int rollno;
	private String name;
	private float marks; //data
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() { //return
		return name;
	}
	public void setName(String name) {  //tesing
		this.name = name;
	}
	public float getMarks() {
		return marks;
	}
	public void setMarks(float marks) {
		this.marks = marks;
	}
	
//	public Student(int rollno,String name,float marks) {
//		//roll--
//		//name--
//		//marks--
//	}
	
//	public void setRollnumber(int rollno) {
//		if(rollno>=1 && rollno<=60) {  //1 to 60
//			this.rollno=rollno;
//		}
//		else {
//			System.out.println("invalid rollnum");
//		}
//
//	}
//	public void setRollnumber(float marks) {
//		if(rollno>=1 && rollno<=60) {  //1 to 60
//			this.rollno=rollno;
//		}
//		else {
//			System.out.println("invalid rollnum");
//		}
//
//	}
//	
//	public int getRollnumber() {
//		
//		return rollno;
//
//	}
//	
//  

}


//encapsulation-->Binding data & operations in a single entity(class)
//setter: value set
//getter : value get/retrieve