package Arrays;

public class Inversion_count {
	
	public static void inv_count(int[] arr) {
		
		boolean flag=false;
		int inversion_count=0;
		
		for(int i=0;i<arr.length-1;i++) {
			
			for(int j=0;j<arr.length-i-1;j++) {
				
				if(arr[j]>arr[j+1]) {
				
				int x=arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=x;
				flag=true;
				inversion_count++;
				}
				
				
			}
			
			if(flag==false) {
				break;
			}
			
			
			
		}
		
		System.out.println(inversion_count);
		
		
	
		
		
		
		
	}

	public static void main(String[] args) {
		
		int a[]= {2, 3, 4, 5, 6};
		inv_count(a);
		
		
		
		// TODO Auto-generated method stub

	}

}
