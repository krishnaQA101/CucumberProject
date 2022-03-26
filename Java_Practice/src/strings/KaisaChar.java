package strings;

import java.util.HashMap;
import java.util.Map;

public class KaisaChar {
	
	public static void DetermineCharType(String a) {
		
		char[] char_array=a.toCharArray();
		
		Map<String,Integer> map1=new HashMap<>();
		
		map1.put("UpperCase", 0);
		map1.put("LowerCase", 0);
		map1.put("Digit", 0);
		map1.put("SpecialCharacter", 0);
		
		
		for(char x:char_array ) {
			
			if(Character.isUpperCase(x)) {
				int value=map1.get("UpperCase");
				map1.put("UpperCase", value+1);
				
				
			}
			
			else if(Character.isLowerCase(x)) {
				int value=map1.get("LowerCase");
				map1.put("LowerCase", value+1);
				
				
			}
			
			else if(Character.isDigit(x)) {
				int value=map1.get("Digit");
				map1.put("Digit", value+1);
				
				
			}
			
			else if(!Character.isLetterOrDigit(x)) {
				int value=map1.get("SpecialCharacter");
				map1.put("SpecialCharacter", value+1);
				
				
			}
			
			}
		 System.out.println(map1);
		
		
	}
	
	
	
	
	public static void main(String args[]) {
		
		DetermineCharType("Abc@123%abc");
		
		
		
		
		
		
	}
	
	

}
