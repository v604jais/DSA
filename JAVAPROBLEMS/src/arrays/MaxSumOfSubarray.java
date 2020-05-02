package arrays;

public class MaxSumOfSubarray {

	public static void main(String[] args) {

		int a[] = { 0,1,3, -4, 10, -1, 11, -10, 40, 3 };
		int length = a.length;

		maxContinuousSum(a, length);

	}

	private static void maxContinuousSum(int a[], int length) {
		int currMax = 0;
		
		for (int i = 0; i < length; i++) {
			int maxSum = a[i];
			for (int j = i + 1; j < length; j++) {
				maxSum += a[j];
				if(currMax<maxSum) {
					currMax=maxSum;
				}
			}
		}
		System.out.println(currMax);
	}

}
