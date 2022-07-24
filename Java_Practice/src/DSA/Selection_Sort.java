package DSA;

import java.util.Arrays;

public class Selection_Sort {
	
	public static int[] selection_sort(int[] arr) {
		
		
		for(int k=0;k<arr.length;++k) {
			
			int min_index=0;
			
			int a[]=Arrays.copyOfRange(arr, k, arr.length);
			
			for(int i=0;i<a.length;++i) {
				
				if(a[i]<a[min_index]) {
					min_index=i;
				}
				
			}
			
			int x=arr[min_index+k];
			arr[min_index+k]=arr[k];
			arr[k]=x;
			System.out.println(arr[k]);
			
			
			
			
		}
		
		
		
		
		return null;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {64,25,12,22,11};
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
