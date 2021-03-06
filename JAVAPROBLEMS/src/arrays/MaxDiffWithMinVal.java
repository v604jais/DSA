package arrays;

public class MaxDiffWithMinVal {

	public static void main(String[] args) {
		
		int arr[]= {2,3,10,6,4,16,8,1};
		int size= arr.length;
		maxDiff(arr,size);

	}

	private static void maxDiff(int[] arr, int size) {
		int res=arr[1]-arr[0];
		int minValue= arr[0];
		for(int j=0; j<size; j++) {
		  res=Math.max(res, arr[j]-minValue);
		  minValue=Math.min(minValue, arr[j]);
		}
		System.out.println(res);
	}

}
