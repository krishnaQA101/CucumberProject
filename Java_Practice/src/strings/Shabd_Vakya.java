package strings;

public class Shabd_Vakya {
	
	public static void Reverse_Shabd_of_Vakya(String sentence) {
		
		String words[]=sentence.split(" ");
		
		StringBuilder sb1=new StringBuilder("");
		
		for(String a:words) {
			
			StringBuilder sb=new StringBuilder(a);
			
			sb1.append(sb.reverse().append(" "));
			
			
			
		}
		
		if((char)sb1.charAt(sb1.length()-1)==' ')
		System.out.println(sb1.toString().substring(0, sb1.length()));
		
		else {
			System.out.println(sb1.toString().substring(0, sb1.length()-1));
		}
		
		
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String sentence=" This is a Dell Laptop ";
		
		Reverse_Shabd_of_Vakya(sentence);
	}

}
