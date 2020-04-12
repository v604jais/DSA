package arrays;

public class DeleteOperationInArray {

	public static void main(String[] args) {
		
		int arr[]= {1,2,3,4,5};
		int numToBeDeleted=1;
		
		System.out.println(delete(arr,5,numToBeDeleted));

	}
   public static int delete(int arr[],int currentFilled, int numToBeDeleted) {
	   
	   //get the the ith value and use it in shifting the element
	   int i;
	   for(i=0; i<currentFilled;i++) {
		   
		   if(arr[i]==numToBeDeleted)
			   break;
	   } 
	  //if number to be deleted is not found then simply return current capacity  
	  if(i==currentFilled)
		  return currentFilled;
	  //shifting all element one position back
	  for(int j=i;j<currentFilled-1;j++) {
		  arr[j]=arr[j+1];
	  }
	  return currentFilled-1;
  }
}
