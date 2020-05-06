package arrays;

public class PrefixSumOn {

	public static void main(String[] args) {
		
		int a[]= {1,2,3,4,5,6,7};
		int l=1;
		int r=3;
		
		getSum(l,r,a);

	}

	private static void getSum(int l, int r, int[] a) {
		
		int sum=0;
		for(int i=l; i<=r;i++)
			sum+=a[i];
		System.out.println(sum);
	}

}
