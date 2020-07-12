package arrays;

public class MaxSumOfSubarray {

	public static void main(String[] args) {

		int a[] = { 4,5,-10,-5,10,1};
		int length = a.length;

		maxContinuousSum(a, length);
		max(a,length);

	}

	private static void maxContinuousSum(int a[], int length) {
		int currMax =0, res=0;
		
		for (int i = 0; i < length; i++) {
			int maxSum = a[i];
			for (int j = i + 1; j < length; j++) {
			   maxSum += a[j];
				if(currMax<maxSum) {
					currMax=maxSum;
				}
				
			}
			res=Math.max(maxSum, currMax);
		}
		System.out.println(res);
	}
	 private static void max(int a[],int length) {
		 
		 int max_so_far=Integer.MIN_VALUE, max_ending_here=0;
		
		 for(int i=0;i<length;i++) {
			 max_ending_here=max_ending_here+a[i];
			 if(max_so_far<max_ending_here)
				 max_so_far=max_ending_here;
			 if(max_ending_here<0)
				 max_ending_here=0;
		 }
		 System.out.println(max_so_far);
	 }

}
