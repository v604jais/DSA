package sorting;



public class InsertionSort {
   //these type of sorting need constant extra space 
	
	
	public static void main(String[] args) {
		
		int arr[]= {5, 1, 4, 2, 8};
		
		
		for(int i=1; i<arr.length;i++) {
			
			int key=arr[i];
			int j=i-1;
			
			while(j>=0 && arr[j]>key){
				
			    arr[j+1]=arr[j];
			    j=j-1;
			
			}
			arr[j+1]=key;
			
	     }
		
		for(int a:arr)
		System.out.print(a);
	}

}
