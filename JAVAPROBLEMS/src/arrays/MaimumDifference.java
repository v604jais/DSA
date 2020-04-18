package arrays;

public class MaimumDifference {

	public static void main(String[] args) {
		
		int arr[]= {2,3,10,6,4,8,1};
		int size= arr.length;
		maxDiff(arr,size);
	}

	private static void maxDiff(int[] arr, int size) {
		
		int maxDif=arr[1]-arr[0];
		for(int i=0; i<arr.length-1;i++)
		   for(int j=1; j<arr.length;j++) 
			  maxDif=Math.max(maxDif, arr[j]-arr[i]);
		
		System.out.println(maxDif);
	}

}
