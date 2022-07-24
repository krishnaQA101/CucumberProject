package Arrays;

public class MergeSort2 {
	
	
	static void merge(int arr[],int l, int m, int r) {
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	public static void sort(int[] arr,int left,int right) {
		
		if(left<right) {
			
			int middle=left+(right-left)/2;
			
			sort(arr,left,middle);
			sort(arr,middle+1,right);
			
			merge(arr,left,middle,right);
			
			
			
			
		}
		
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr= {3,11,1,7,16,9};
		sort(arr,0,arr.length-1);
		

	}

}
