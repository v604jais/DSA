package arrays;

public class fibonaci {

	public static void main(String[] args) {
		
		int n1,n2,n3;
		n1=0;n2=1;
		System.out.print(n1+" "+n2+" ");
		for(int i=0; i<5;i++) {
		    n3=n1+n2;
			System.out.print(n3+" ");
			n1=n2;
			n2=n3;
		}
        
	}

}
