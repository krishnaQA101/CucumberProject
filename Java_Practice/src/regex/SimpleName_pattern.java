package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SimpleName_pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String pattren1="[aeiou]{1,2}";
		String mat="Pttrn s bdvdv";
		
		Pattern pattern=Pattern.compile(pattren1);
		
		Matcher matcher=pattern.matcher(mat);
		
		boolean matchFound=matcher.find();
		System.out.println(matchFound);
		
		

	}

}
