package arrays;

public class leftRotateByD {

	public static void main(String[] args) {
		
		int a[]= {1,2,3,4,5};
		int d=2;
        leftRotateByNd(a,d); 
        
        for(int i=0; i<a.length;i++) {
			System.out.println(a[i]);
		}
	}
   
	
	public static int[] leftRotateByNd(int a[], int d) {
		
		for(int i=0;i<d;i++)
		 LeftRotateBy1.leftRotateByOne(a);

		
		return a;
	}
}
