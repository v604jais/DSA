package sorting;

public class SelectionSort {

	public static void main(String[] args) {
		int arr[]= {28,2,4,10,16,1};
		for(int i =0; i<arr.length;i++) {
            
			int min_indx=i;
			for(int j=i+1; j<arr.length;j++) {
				 
				if(arr[j]<arr[min_indx]) {
					       min_indx=j;
				}
			}
			arr[min_indx]=arr[min_indx]^arr[i]^(arr[i]=arr[min_indx]);
			
	}
		for(int i =0; i<arr.length;i++)
               System.out.println(arr[i]);
}
}