package star;

public class Hollow_Rhombus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=1;i<=10*2;i++) {
			
			if(i<=10) {
			
			for(int j=1;j<=10-i;j++) {
				
				System.out.print(" ");
				
			}
			
              for(int j=1;j<=i;j++) {
            	  
            	  if(j==1||j==i) {
				
				System.out.print("* ");}
            	  
            	  else {
            		  System.out.print("  ");
            	  }
				
			}
              
			}
			
			else {
				
				for(int j=1;j<=i-10;j++) {
					
					System.out.print(" ");
					
				}
				
	              for(int j=1;j<=20-i;j++) {
	            	  
	            	  if(j==1||j==20-i) {
					
					System.out.print("* ");}
	            	  
	            	  else {
	            		  System.out.print("  ");
	            	  }
					
				}
				
				
			}
              System.out.println();
			
			
		}
		

	}

}
