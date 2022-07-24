package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//The number should contain 10 or 11 or 12 digits.
//If it contains 10 digits, then first  digit should be 7 or 8 or 9.
//If it contains 11 digits, then first  digit should be 0 and second rule followed.
//If it contains 12 digits, then first two digits should be 91 and second rule followed 
//Expected O(1)
public class Phone_Number {
	
	
	public static int validateNumber(String s) {
		
		if(s.length()==10) {
			Pattern pattern=Pattern.compile("^[7-9][0-9]{9}$");
			Matcher matcher=pattern.matcher(s);
			boolean matchFound=matcher.matches();
			
		    if(matchFound)
		    	return 1;
		    else
		    	return 0;
			
		}
		
		else if(s.length()==11) {
			Pattern pattern2=Pattern.compile("^0[7-9][0-9]{9}$");
			Matcher matcher=pattern2.matcher(s);
			boolean matchFound=matcher.matches();
			

		    if(matchFound)
		    	return 1;
		    else
		    	return 0;
			
		}
		
		else if(s.length()==12) {

			Pattern pattern3=Pattern.compile("^91[7-9][0-9]{9}$");
			Matcher matcher=pattern3.matcher(s);
			boolean matchFound=matcher.matches();
			
		    if(matchFound)
		    	return 1;
		    else
		    	return 0;
			
		}
		
		return 0;
		
		
		
	}

	public static void main(String[] args) {
		
		System.out.println(validateNumber("97123456789"));
		
		
		
		

	}

}
