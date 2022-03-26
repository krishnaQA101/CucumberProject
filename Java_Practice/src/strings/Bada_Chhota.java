package strings;

public class Bada_Chhota {
	
	public static void Reverse_small_letters_only(String a) {
		
		char[] char_set=a.toCharArray();
		StringBuilder sb1=new StringBuilder("");
		String reverse_String=new StringBuilder(a).reverse().toString();
		System.out.println(reverse_String);
		int k=0;
		
		for(int i=0;i<char_set.length;i++) {
			
			if(!Character.isLowerCase(char_set[i])) {
				
				
				sb1.append(char_set[i]);
			
				
			}
			
			else if(Character.isLowerCase(reverse_String.charAt(k))) {
				
				sb1.append(reverse_String.charAt(k));
				k++;
			}
			
			
		}
		
		System.out.println(sb1.toString());
		
		
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
      String sentence="This is A Del1l Lapto2p";
		
		Reverse_small_letters_only(sentence);

	}

}
