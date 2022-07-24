package star;

public class Pascal_Triangle {

	public static void main(String[] args) {
		
		for(int i=1;i<=10*2;i++) {
			
			if(i<=10) {
			
			for(int j=1;j<=i;j++) {
				
				System.out.print("* ");	
			}
			
			System.out.println();
		}
		
			else {
				

				for(int j=1;j<=20-i;j++) {
					
					System.out.print("* ");	
				}
				
				System.out.println();
			}
		
		
		}
		
		
		// TODO Auto-generated method stub

	}

}
