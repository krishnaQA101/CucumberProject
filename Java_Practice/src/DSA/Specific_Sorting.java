package DSA;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Specific_Sorting {
	
	public static void SSorting(int arr[]) {
		
		List<Integer> even_list=new ArrayList<>();
		List<Integer> odd_list=new ArrayList<>();
		
		for(int i=0;i<arr.length;i++) {
			
			if(arr[i]%2==0) {
				
				even_list.add(arr[i]);
				}
			
			else {
				
				odd_list.add(arr[i]);
				
				
			}
			
			even_list.sort(null);
			odd_list.sort(null);
			
			}
		
		int i = 0,j = 0,k=0;
		int size=even_list.size()+odd_list.size();
		int[] arr1=new int[size];
		
		while(i<odd_list.size()) {
			arr1[k]=odd_list.get(i);
			i++;
			k++;
			}
		
		while(j<even_list.size()) {
			arr1[k]=even_list.get(j);
			j++;
			k++;
			}
		
		System.out.println(Arrays.toString(arr1));
		
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1, 2, 3, 5, 4, 7, 10};
		SSorting(arr);

	}

}
