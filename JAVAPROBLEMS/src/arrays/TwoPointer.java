package arrays;

public class TwoPointer {

	public static void main(String[] args) {
		
		int[] arr= {1,2,3,4,5,6,7,10,11,20};
		int x=23;
		int n=arr.length;
		int l=0,r=n-1;
		
		while(l<r) {
			
			if(arr[l]+arr[r]==x)
			{
				System.out.println("Yes Pair is Present at index : "+ l+" and element is "+arr[l] +" other element idex is "+r +" and another element is  "+arr[r]+" to make sum of "+x);
				break;
			}
			else if(arr[l]+arr[r]<x) {
				l++;
			}else r--;	
			
		}
		
	}

}
