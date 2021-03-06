package arrays;

public class MaximumLengthOfEvenOdd {

	public static void main(String[] args) {

		int a[] = { 10, 12, 14, 7, 8 };
		int b[] = { 10,10, 7, 10, 13, 14 };

		maximumLengthOfEvenOdd(a);
		maximumLengthOfEvenOdd(b);

	}

	private static void maximumLengthOfEvenOdd(int c[]) {
		int len = 1;
		for (int i = 0; i < c.length; i++) {
			int count = 1;
			
			for (int j = i + 1; j < c.length; j++) {
				if (c[j - 1] % 2 == 0 && c[j] % 2 != 0 || c[j] % 2 == 0 && c[j - 1] % 2 != 0) {
					count++;
				} else
					break;
			}
		  len = Math.max(count, len);
		}
		
		System.out.println("Maximum EvenOdd pattern is of length : "+len);
	}

}
