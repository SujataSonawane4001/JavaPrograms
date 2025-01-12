package MethodsDemo;

public class Method_demo2 {
    public int addition(int x,int y ) {  //return type --Primitive(int,float,double) to non primitive(array,string,class)
	    int r=x+y;
    //	return 126; //constant
    	
    //	return x;   //variable
    	
    //	return substract();//method
	    
	    return x+y;  //Operation
	}
    public boolean m1(int x) {
    	
    	return true;
    }
    
    
    private int substract() {
    	int x=10;
		//System.out.println("substract");
		return  x;

	}
	public static void main(String[] args) {
		Method_demo2 m=new Method_demo2();
      int b= m.addition(12, 50);
      System.out.println(b);
     // System.out.println(b);
	//	int result=m.addition(0)
       
	}

}


//return keyword-->constant/variable/operations/method call
