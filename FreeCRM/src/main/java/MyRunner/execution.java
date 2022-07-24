package MyRunner;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class execution {

	public static void main(String[] args) {
	
		System.out.println(select(1));
		
		
		
	}

	static String select(int number) {
	    String output;
	    switch (number) {
	        case 0:
	        default:
	        case 1:
	            output = "positive";
	    }
	    return output;
	}
}
