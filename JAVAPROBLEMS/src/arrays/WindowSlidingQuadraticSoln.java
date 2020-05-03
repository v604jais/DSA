package arrays;

public class WindowSlidingQuadraticSoln {

	public static void main(String[] args) {
		
		//given an array of integer and a number k, find the maximum sum of K consecutive elements
		  int a[]= {1,8,30,-5,20,7};
          int k=3;
          int maxSum=Integer.MIN_VALUE;
          for(int i=0; i+k-1<a.length;i++){
        	  int sum=0;
        	  for(int j=0;j<k;j++) {
        		  sum+=a[i+j];
        		  maxSum=Math.max(maxSum, sum);
        	  }
          }
          System.out.println(maxSum);
	}

}
