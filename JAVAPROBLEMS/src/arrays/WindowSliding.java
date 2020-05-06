package arrays;

public class WindowSliding {

	public static void main(String[] args) {
		int a[]= {1,8,30,-5,20,7};
		int k=3;
		int currSum=0;
		for(int i=0; i<k;i++)
			currSum+=a[i];
		int MaxSum=currSum;
		for(int i=k;i<a.length;i++) {
			currSum+=(a[i]-a[i-k]);
			MaxSum=Math.max(MaxSum, currSum);
		}
        System.out.println(MaxSum);
	}

}
