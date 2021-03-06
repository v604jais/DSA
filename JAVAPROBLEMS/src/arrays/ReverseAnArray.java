package arrays;

public class ReverseAnArray {

	public static void main(String[] args) {

		int arr[] = { 1, 2, 3, 4, 5 };
		int Rarr[] = new int[arr.length];
		System.out.println("Before Reverse");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

		reverseArray(arr, Rarr);
		System.out.println("After Reverse");
		for (int i = 0; i < Rarr.length; i++) {
			System.out.println(Rarr[i]);
		}
		//time complexity is O(n)
		reverse(arr, arr.length);
		System.out.println("After Using While loop Reverse");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

	}

	public static int[] reverseArray(int arr[], int Rarr[]) {
		int count = 0;

		for (int i = arr.length - 1; i >= 0; i--) {

			Rarr[count++] = arr[i];
		}
		return Rarr;
	}
	
	public static void reverse(int arr[], int Size) {
		
		int low=0; int high=Size-1; int temp;
		while (low<high)
		{
		    temp=arr[low];
		    arr[low]=arr[high];
		    arr[high]=temp;
		    low++;
		    high--;
		    
	    }
	}
}
