package arrays;

public class RemoveDuplicateFromSortedElement {

	public static void main(String[] args) {

		int arr[] = {1,1,1,2,2,2,2,3,4,4};
		
        int res=removeDuplicate(arr);
        System.out.println(res);
        for(int i=0; i<res; i++) {
        	System.out.print(arr[i]+" ");
        }
	}

	public static int removeDuplicate(int arr[]) {

		int distinctElementSize = 1;
		for (int i = 1; i < arr.length; i++) {
			if (arr[distinctElementSize - 1] != arr[i]) {
				arr[distinctElementSize] = arr[i];
                    distinctElementSize++;
             }
		}
		return distinctElementSize;
	}
}
