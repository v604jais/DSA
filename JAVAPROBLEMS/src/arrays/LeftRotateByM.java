package arrays;



public class LeftRotateByM {

	public static void main(String[] args) {
		

		int a[]= {1,2,3,4,5};
		int d=2;
		int size=a.length;
        a=leftRotateByM(a,0,d-1); 
        a=leftRotateByM(a,d,size-1);
        a=leftRotateByM(a,0,size-1);  
        for(int i=0; i <a.length; i++) {
			System.out.println(a[i]);
		 }

	}
	 
	 public static int[] leftRotateByM(int a[],int low, int high) {
		
		int temp;
		 while(low<high) {
			 
		    temp=a[low];
		    a[low]=a[high];
		    a[high]=temp;		
		    low++;
		    high--;
		 }
		
		 
		 return a;
	 }

}
