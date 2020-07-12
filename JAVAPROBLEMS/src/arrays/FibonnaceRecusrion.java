package arrays;

public class FibonnaceRecusrion {

	public static void main(String[] args) {
		
		
		fibonaci(10);
		
		

	}
	
	static void fibonaci(int count) {
		
        int n1=0, n2=1;
        System.out.print(n1+" "+n2+" ");
		
		while(count>2) {
		
		int n3=n1+n2;
		System.out.print(n3+" ");
		n1=n2;
		n2=n3;
		count--;
		
		}
		
	}

}
