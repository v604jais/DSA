package sorting;

public class InsertionSorting {
    
	
	
	
	public static void main(String[] args) {
		int i,j,key;
		int arr[]={1,14,0,2,18,16};
        
		for(i=1; i<arr.length; i++) {
			 key=arr[i];
			 j=i-1;
			 
			 while(j>=0 && arr[j]>key) {
				 
				 arr[j+1]=arr[j];
				 j=j-1;
			 }
			arr[j+1]=key;
		}
		
		for(int k=0;k<arr.length;k++) {
		System.out.println(arr[k]);
		}
	}

}
