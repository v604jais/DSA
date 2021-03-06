package arrays;

public class LeftRotateByN {

	public static void main(String[] args) {
		
		int a[]= {1,2,3,4,5};
		int size= a.length;
		int N=2;
		leftRotate(a,size, N);
		for(int i=0; i<size; i++) {
			System.out.println(a[i]);
		}
	}
	
	 public static int[] leftRotate(int a[],int size, int N) {
		 
		 //copy N element in temp so that we can append it after rotation
		 int temp[]= new int[N];
		 for(int i=0; i<N; i++) {
				temp[i]=a[i];
			}
		 //shifting element by n times
		 for(int i=N; i<size; i++) {
				a[i-N]=a[i];
			}
		 //appending N element in shifted array
		 for(int i=0; i<N; i++) {
			  a[size-N+i]= temp[i];
			}
		 
		 return a;
	 }

}
