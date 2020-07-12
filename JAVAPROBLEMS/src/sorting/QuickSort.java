package sorting;

public class QuickSort {

	public static void main(String[] args) {
		
		int[] arr= {5, 1, 4, 2, 8, 7};
		int low=0;
		int high=arr.length-1;
		
		quickSort(arr, low, high);
		
		for(int a:arr)
			System.out.print(a);
	}

	private static int partition(int[] arr, int low, int high) {
		//lower index i
		int i=low-1;
		int pivot=arr[high];
		for(int j=low; j<high; j++){
			
			if(arr[j]<=pivot) {
				i++; // increment index of smaller element
				//swap
				arr[i]=arr[i]^arr[j]^(arr[j]=arr[i]);
			}	
		}
		arr[i+1]=arr[i+1]^arr[high]^(arr[high]=arr[i+1]);
		return (i+1);
	}

	private static void quickSort(int[] arr, int low, int high) {
		
		if(low<high) {
		//partition index
		int pi=partition(arr,low,high);
		//before pivot
		quickSort(arr, low, pi-1); 
		//after pivot
		quickSort(arr, pi+1, high); 
		}
	}
}
