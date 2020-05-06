package arrays;

public class PreFixSumO1 {

	public static void main(String[] args) {
		
		int a[]= {1,2,3,4,5,6,7};
		int l=0;
		int r=3;
		int sum=0;
		int prefix[]= new int[a.length];
		for(int i=0; i<a.length;i++) {
			sum+=a[i];
			prefix[i]=sum;
		}
			
		
		
		getSum(l,r,prefix);


	}

	private static void getSum(int l, int r, int[] psum) {
		if(l!=0)
		System.out.println(psum[r]-psum[l-1]);
		else
		System.out.println(psum[r]);
	}

}
