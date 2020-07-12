package sorting;

public class Buble {

	public static void main(String[] args) {
		
		//compare each element with adjacent element and after swap 
		//come out of loop and compare with i+1 element
		int arr[]= {5, 1, 4, 2, 8};
		
		for(int i=0; i<arr.length;i++) {
			
			for(int j=i+1; j<arr.length;j++) {
				
				if(arr[i]>arr[j]) {
					arr[i]=arr[i]^arr[j]^(arr[j]=arr[i]);
				}
			}
		}
		for(int a:arr)
			System.out.print(a);
	}

}
