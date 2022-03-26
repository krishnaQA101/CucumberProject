package strings;

public class UC_Khali_Sthan {

public static void Space_Position_Unchanged(String sentence) {
		
		StringBuilder sb1=new StringBuilder("");
		char char_set[]=sentence.toCharArray();
		String reverse_sen=new StringBuilder(sentence.replace(" ", "")).reverse().toString();
		
		int k=0;
		for(int i=0;i<char_set.length;i++) {
			
			if(char_set[i]==' ') {
				sb1.append(char_set[i]);
			}
			
			else{
				sb1.append(reverse_sen.charAt(k));
				k++;
			}
			
			
			
		}
		
		System.out.println(sb1.toString());
			
			
			
		
		
		
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String sentence=" This is a Dell Laptop ";
		
		Space_Position_Unchanged(sentence);
	}

}
