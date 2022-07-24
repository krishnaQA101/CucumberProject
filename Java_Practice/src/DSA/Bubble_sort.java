package DSA;

public class Bubble_sort {
	
	public static int[] bubbleSort(int arr[]) {
		
		boolean flag;
		
		for(int j=0;j<arr.length-1;j++) {
			
			flag=false;
			
			for(int i=0;i<arr.length-j-1;i++) {
			
			if(arr[i]>arr[i+1]) {
			
			int temp=arr[i];
			arr[i]=arr[i+1];
			arr[i+1]=temp;
			flag=true;
			}
			
			
			
			}
			
			if(flag==false) {
				break;
			}
			
			}
		
		return arr;
		
		
	}
	

	public static void main(String[] args) {
		
		
		// TODO Auto-generated method stub
		int arr[] = {64, 34, 25, 12, 22, 90,13};
        int arr1[]=bubbleSort(arr);
        
        for(int i=0;i<arr1.length;i++) {
        	System.out.println(arr1[i]);
        	
        }

	}

}
