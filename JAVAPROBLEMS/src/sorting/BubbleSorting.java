package sorting;

public class BubbleSorting {

	public static void main(String[] args) {
		
		int arr[]={1,14,0,2,18,16};
		
		for(int i=0; i<arr.length;i++) {
			
			for(int j=i+1; j<arr.length;j++) {
				
				if(arr[i]>arr[j]) {
					
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
					
				}
			}
		}
		
		for(int k=0; k<arr.length;k++)
		     System.out.println(arr[k]);
		
	}

	/*for(int i=0; i<arr.length;i++) {
		
		for(int j=0; j<arr.length-1;j++) {
			
			if(arr[j]>arr[i]) {
				
				int temp=arr[j];
				arr[j]=arr[i];
				arr[i]=temp;
				
			}
		}
	}
	
	for(int k=0; k<arr.length;k++)
	     System.out.println(arr[k]);*/
}
