package misc;

import java.util.Arrays;

public class Singleton {
	
	
	
	private static Singleton num=null;
	
	
	
	
//	The number should contain 10 or 11 or 12 digits.
//	If it contains 10 digits, then first  digit should be 7 or 8 or 9.
//	If it contains 11 digits, then first  digit should be 0 and second rule followed.
//	If it contains 12 digits, then first two digits should be 91 and second rule followed 
	//Expected O(1)

	public static Singleton getNum() {
		
		if(num==null) {
			num=new Singleton();
		}
		
		return num;
		
	}





	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		
		

		

	}

}
