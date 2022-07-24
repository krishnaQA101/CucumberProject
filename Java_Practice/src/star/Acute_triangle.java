package star;

public class Acute_triangle {

	public static void main(String[] args) {
		
		for(int i=1;i<=10;i++) {
			for(int j=1;j<=10;j++) {
				
				if(i==10||j==10-i||j==i) {
					
					System.out.print("*");
					
				}
				
				else {
					System.out.print(" ");
				}
				
				
				
				
			}
			
			System.out.println();
			
			
			
		}
		
		
		
		

	}

}
