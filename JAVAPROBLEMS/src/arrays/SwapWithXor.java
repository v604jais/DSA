package arrays;

public class SwapWithXor {

	public static void main(String[] args) {
		
		int a=10;
		int b=15;
		
		a=a^b^(b=a);

		System.out.print("a : "+a+ " b : "+b);
	}

}
