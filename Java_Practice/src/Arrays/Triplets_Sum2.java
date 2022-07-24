package Arrays;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Triplets_Sum2 {
	
	public static void sum_zero(int[] arr) {
		
		Set<Integer> set1=new HashSet<>();
		
		int triplets = 0;
		for(int i=0;i<arr.length;i++) {
			 
			for(int j=0;j<arr.length;j++) {
				
				for(int k=0;k<arr.length;k++) {
					
					if(i!=j && j!=k && k!=i) {
						
						int sum=arr[i]+arr[j]+arr[k];
						System.out.println(sum);
						
						
						
					}
					
					
				}
				
				
				
				
			}
		}
		
		
	}
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {0, -1, 2, -3,1};
		sum_zero(a);
		

	}

}
