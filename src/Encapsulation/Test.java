package Encapsulation;

public class Test {
//    public void m1(int rno) {
//		if(rno==23) {
//			System.out.println("rno is not valid");
//		}else
//		{
//			System.out.println("valid");
//		}
//
//	}
	public static void main(String[] args) {
		Student s=new Student();
		s.setName("Testing");
		System.out.println(s.getName());
		s.setRollno(56);
		int rollnumber=s.getRollno();
//		System.out.println(rollnumber);
//		Test t=new Test();
//		t.m1(rollnumber);
		
		
	}

}
