package sorting;

public class MergeSort {

	
	
	
	public static void mergeSort(int[] arr, int lb, int ub) {
		
		if(lb<ub) {
			
			int mid=(lb+ub)/2;
			mergeSort(arr,lb,mid);
			mergeSort(arr,mid+1,ub);
		    merge(arr,lb,mid,ub);
			
		}
		
		
	}

	public static void merge(int[] arr, int lb, int mid, int ub) {
		 // Find sizes of two subarrays to be merged 
        int n1 = mid - lb + 1; 
        int n2 = ub - mid; 
  
        /* Create temp arrays */
        int L[] = new int[n1]; 
        int R[] = new int[n2]; 
  
        /*Copy data to temp arrays*/
        for (int i = 0; i < n1; ++i) 
            L[i] = arr[lb + i]; 
        for (int j = 0; j < n2; ++j) 
            R[j] = arr[mid + 1 + j]; 
  
        /* Merge the temp arrays */
  
        // Initial indexes of first and second subarrays 
        int i = 0, j = 0; 
  
        // Initial index of merged subarry array 
        int k = lb; 
        while (i < n1 && j < n2) { 
            if (L[i] <= R[j]) { 
                arr[k] = L[i]; 
                i++; 
            } 
            else { 
                arr[k] = R[j]; 
                j++; 
            } 
            k++; 
        } 
  
        /* Copy remaining elements of L[] if any */
        while (i < n1) { 
            arr[k] = L[i]; 
            i++; 
            k++; 
        } 
  
        /* Copy remaining elements of R[] if any */
        while (j < n2) { 
            arr[k] = R[j]; 
            j++; 
            k++; 
        } 	
	
	}

}
