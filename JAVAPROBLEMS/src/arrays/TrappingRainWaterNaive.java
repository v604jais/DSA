package arrays;


public class TrappingRainWaterNaive {

	public static void main(String[] args) {
		
		int arr[]= {3,0,1,2,5};
		
		int lmax, rmax, res;
		res=0;
		for(int i=1; i<arr.length-1; i++) {
			lmax=arr[i];
			for(int j=0; j<i;j++)
			{
				lmax=Math.max(lmax, arr[j]);
			}
			rmax=arr[i];
			for(int j=i;j<arr.length;j++) {
				rmax=Math.max(rmax,arr[j]);
			}
			res+=Math.min(lmax, rmax)-arr[i];
		}
       System.out.println(res);
       
       
	}
   
}
