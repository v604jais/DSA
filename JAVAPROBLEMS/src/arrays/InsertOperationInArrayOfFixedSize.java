package arrays;

public class InsertOperationInArrayOfFixedSize {

	public static void main(String[] args) {

		int arr[] = new int[6];
		arr[0] = 0;
		arr[1] = 1;
		arr[2] = 2;
		arr[3] = 3;

		System.out.println(insert(arr, 4, arr.length, 4,4));
		for(int i=0; i <arr.length;i++)
		System.out.println(arr[i]);

	}
   //Time complexity is O(n)
	public static int insert(int arr[], int filledElement, int Size, int num, int pos) {
        
		//check current capacity and  size of container 
		if (filledElement == Size) {
			return filledElement;
		}
        //get index by doing subtraction of 1 as position starts from 1
		int index = pos - 1;
        // shift element in container only if index is smaller
		for (int i = filledElement - 1; i >= index; i--) {
			arr[i + 1] = arr[i];
		}
		//insert the element at given index
		arr[index]=num;
	   // return current capacity	
       return filledElement+1;
	}

}
