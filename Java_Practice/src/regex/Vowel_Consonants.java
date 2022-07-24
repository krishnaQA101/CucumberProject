package regex;

import java.util.regex.Pattern;

public class Vowel_Consonants {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] arr=sep("scxqwgdc vmhdcvwsddswdhwbdhebdhevedfeygdyeehedbbfjffuhiidodeodkededckendcjedncvkqsdvhcwvcwdvcjhsdvcsd c");
       
		for(String a:arr) {
			System.out.println(a);
		}
	}
	
	public static String[] sep(String str) {
		
		char[] char_arr=str.toCharArray();
		String[] a1=new String[str.length()];
		int j=0;
		
		for(int i=0;i<char_arr.length;i++) {
			
			String c=String.valueOf(char_arr[i]);
			
			if(c.equalsIgnoreCase("a")||c.equalsIgnoreCase("e")||c.equalsIgnoreCase("i")||c.equalsIgnoreCase("o")||
					c.equalsIgnoreCase("u")) {
				a1[j]=c;
				j++;
				
			}
			
			else {
				a1[j]=c;
			}
			
			
			
		}
		
		return a1;
		
	}

}
