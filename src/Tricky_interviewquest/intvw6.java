package Tricky_interviewquest;

public class intvw6 {

	public static void main(String[] args) {
		int five=5;
		int two=2;
		
		int total=five+(five>6 ? ++two : --two);  //5+(5 > 6  ? 3 : 1)
        System.out.println(total);
	}

}
