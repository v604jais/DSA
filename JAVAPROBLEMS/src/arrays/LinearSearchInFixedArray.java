package arrays;

public class LinearSearchInFixedArray {

	public static void main(String[] args) {
		
	   /* when array is not sorted  takes O(n) times called linear search 
		  but when we have sorted array it takes O(log n) time */
		
		int searchingNum=1;
		int arr[] = {9,4,5,2,1,0};
		System.out.println("Array size is "+arr.length);
		System.out.println("KEY found at index "+searchingNuminArray(arr, searchingNum ));

	}

	public static int searchingNuminArray(int arr[], int searchingNum )
	{
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]==searchingNum)
			{
				return i;
			}
			
		}
		return -1;
	}
}
