package DSA;

public class Quick_Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {6,1,7,9,2,3,23,1,6,3};
		sort(arr,0,arr.length-1);
		for(int a:arr) {
			System.out.println(a);
		}

	}
    
	
	static void sort(int[] a,int left,int right) {
		
		if(left<right) {
		
		int position=partition(a,left, right);
		
		sort(a,left,position-1);
		
		sort(a,position+1,right);
		
		}
		
		
	}
	
   static int partition(int[] a,int left,int right) {
		
		int i=left-1;
		
		int pivot=a[right];
		
		for(int j=left;j<right;j++) {
			
			if(a[j]<pivot) {
				i++;
				//swap the a[i] and a[j]
				int k=a[j];
				a[j]=a[i];
				a[i]=k;
				
			}
			
		}
		
		int p=a[i+1];
		a[i+1]=pivot;
		a[right]=p;
		
		
		return i+1;
	  	
		
	}

}
