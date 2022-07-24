package DSA;

import java.util.Arrays;

public class Selection_Sort2 {
	
	public static int[] selection_sort(int[] arr) {
		
		
		for(int k=0;k<arr.length;++k) {
			
			int min_index=k;
			
			for(int j=k;j<arr.length;++j) {
				
				if(arr[j]<arr[min_index]) {
					
					min_index=j;
					
				}
				
				
			}
			
			int x=arr[min_index];
			arr[min_index]=arr[k];
			arr[k]=x;
			System.out.println(x);
			
			
			
			
		}
		
		
		
		
		return null;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {64,25,12,22,11,90,74};
		selection_sort(a);

	}
	
	
	// Find the minimum element in arr[0...4]
	// and place it at beginning
	//11 25 12 22 64

	// Find the minimum element in arr[1...4]
	// and place it at beginning of arr[1...4]
	//11 12 25 22 64

	// Find the minimum element in arr[2...4]
	// and place it at beginning of arr[2...4]
	//11 12 22 25 64

	// Find the minimum element in arr[3...4]
	// and place it at beginning of arr[3...4]
	//11 12 22 25 64 

}
