package star;

public class Rhombus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i=1;
		int j=1;
		
		for(i=1;i<=10*2;i++) {
			
			if(i<=10) {
			for(j=1;j<=10-i;j++) {
				
				System.out.print(" ");
			}
			
			for(j=1;j<=i;j++) {
				
				System.out.print("* ");
				
				}
			System.out.println();
			
			
			
			}
			else {
				for(j=1;j<=i-10;j++) {
					
					System.out.print(" ");
				}
				
				for(j=1;j<=20-i;j++) {
					
					System.out.print("* ");
					
					}
				System.out.println();
			}
		
		}
       
	}
	

}
