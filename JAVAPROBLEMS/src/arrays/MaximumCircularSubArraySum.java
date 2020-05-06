package arrays;

public class MaximumCircularSubArraySum {

	public static void main(String[] args) {
		
		int a[]= {1,-2,1,2-2,3};//{5,-2,3,4};
		int n=a.length;
		int res=a[0];
		for(int i=0;i<a.length;i++) {
			
			int curr_max=a[i];
		    int curr_sum=a[i];
			for(int j=1; j<a.length;j++) {
				int index=(i+j)%n;
				curr_sum+=a[index];
				curr_max=Math.max(curr_sum,curr_max);
			}
		   res=Math.max(res, curr_max);
		}
	  System.out.println(res);
	}
}
