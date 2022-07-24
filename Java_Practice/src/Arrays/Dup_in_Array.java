package Arrays;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Dup_in_Array {
	
	public static void duplicates(int[] a, int size) {
		
		Map<Integer,Integer> map1=new HashMap<>();
		Set<Integer> set1=new HashSet<>();
		
		for(int i=0;i<size;++i) {
			
			if(!map1.containsKey(a[i])) {
				
				map1.put(a[i], 1);
				
				
			}
			
			else {
				int b=map1.get(a[i]);
				
				map1.put(a[i], b+1);
				set1.add(a[i]);
			}
			
			
		}
		
		if(set1.size()==0) {
			System.out.println(-1);
		}
	
		else {
		
		System.out.println(set1);}
	
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a={2,3,1,2,3};
		duplicates(a, 5);

	}

}
