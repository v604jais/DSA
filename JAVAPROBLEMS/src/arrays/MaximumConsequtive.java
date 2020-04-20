package arrays;

public class MaximumConsequtive {

	public static void main(String[] args) {

		int arr[] = { 0, 1, 1,0,1, 0 };
		int key = 1;
	      System.out.println(maxConsequtiveCount(arr, key));
	}

	private static int maxConsequtiveCount(int arr[], int key) {

		int max = 0;
        int count=0;
		for (int i = 0; i < arr.length; i++) {
			
			if (arr[i] == key) {
				count++;

				if (max < count) {
					max = count;
				}
			}else {count=0;}
		}

		return max;
	}

}
