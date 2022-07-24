package MyRunner;

import java.util.Arrays;

public class testing {

	public static void main(String[] args) {

		
		String a="This is not a method";
		a=a.toLowerCase();
		String reverse="";
		
		String[] s=a.split(" ");
		
		for(int i=0;i<s.length-1;i++) {
			
			boolean swap=true;
			
			for(int j=0;j<s.length-i-1;j++) {
			
			if(s[j].compareTo(s[j+1])>0) {
				String b=s[j];
				s[j]=s[j+1];
				s[j+1]=b;	
				swap=false;
			}
			
			}
			
			if(swap==true) {
				break;
			}
			System.out.println(Arrays.asList(s));
		}
		
		
		
		
		
		

	}

}
