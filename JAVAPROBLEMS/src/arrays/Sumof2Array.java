package arrays;

public class Sumof2Array {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5};
		int b[]= {1,2,3,4,5};
		int c[]=new int[a.length];
		for(int i=0; i <a.length;i++)
		    c[i]=a[i]+b[i];
		for(int i=0; i <a.length;i++)
			System.out.println(c[i]);
	}

}
