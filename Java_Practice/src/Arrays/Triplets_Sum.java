package Arrays;

import java.util.ArrayList;
import java.util.List;

public class Triplets_Sum {
	
	public static void sum_zero(int[] arr) {
		
		int zero_counter=0;
		int counter=0;
		for(int i=0;i<arr.length;i++) {
			
			if(arr[i]==0) {
		       zero_counter++;
			}
			
			for(int j=i;j<arr.length;j++) {
				
				if((arr[i]+arr[j])==0 && arr[i]!=0 && i!=j) {
					
				  counter++;
					
					
				}
				
				
			}
			
		}
		
		if(zero_counter==0) {
			counter=0;
		}
		
		if(zero_counter>=3) {
			counter++;
		}
		
		System.out.println(counter);
		
		
		
	}
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {0, -1, 2, -3, 1};
		sum_zero(a);
		

	}

}
