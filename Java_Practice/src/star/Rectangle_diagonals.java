package star;

public class Rectangle_diagonals {

	public static void main(String[] args) {
		
		for(int i=1;i<=10;i++) {
			
			for(int j=1;j<=10;j++) {
				
				if(i==1||j==10||j==1||j==i||i==10||j==10-i) {
					
					
					System.out.print("*");
					}
				
				else {
					System.out.print(" ");
				}
				
				
				
				
			}
			
			System.out.println();
			
			
		}
		
		
		
		
		
		
		
		
		
		// TODO Auto-generated method stub

	}

}

//Hollow triangle code

//for(int j=1;j<=10;j++) {
//	
//	if(j==1||j==i||i==10) {
//		
//		
//		System.out.print("*");
//		}
//	
//	else {
//		System.out.print(" ");
//	}
//	
//	
//	
//	
//}
//
//System.out.println();
