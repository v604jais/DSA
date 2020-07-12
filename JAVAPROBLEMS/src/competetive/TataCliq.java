package competetive;

import java.util.Arrays;

public class TataCliq {

	public static void main(String[] args) {
		
		int arr[]= {1,2,3}; //{1,3,4,2,5,7,6,8,9};
		
		Arrays.sort(arr);
		int size=arr.length;
		int startIndex= size/3;
		int sum=0;
		for (int i=startIndex; i<size; i+=2) {
			
			sum+=arr[i];
		}
		System.out.println(sum);
		

	}

}
