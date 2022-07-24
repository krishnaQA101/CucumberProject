package regex;

public class replace_spaces {
	
	public static String replace_more_than_one_String(String s) {
		
		
		s=s.replaceAll("\\s{2,}", " ");
		
		return s;
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.out.println("Testing  is an     important         task");
		System.out.println(replace_more_than_one_String("Testing  is an     important         task"));
		

	}

}
