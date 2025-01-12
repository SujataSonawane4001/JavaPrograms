package Pattern;

public class Fiboancci_pattern {

	public static void main(String[] args) {
		int x=0,y=1,temp;
		for (int line = 1; line <=4; line++) {
			
			for (int ast = 1; ast <=line; ast++) {
				System.out.print(x+" ");
				temp=x+y;
				x=y;
				y=temp;
			}
			System.out.println();
		}

	}

}


//0 1 1 2 3 5 8 13 21 34


//0
//1 1
//2 3 5
//8 13 21 34
