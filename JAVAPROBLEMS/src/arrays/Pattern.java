package arrays;

public class Pattern {

	public static void main(String[] args) {

		for (int i = 0; i < 4; i++) {

			
			for (int num =i; num > 0; num--) {

				System.out.print(num);

			}
			
			
			/*for (int space = 2 * 3 - 1; space > 0; space--) {

				System.out.print(" ");

			}*/
			
			for (int num=4; num > i; num--) {
                 
				  System.out.print(" ");
				

			}
			for (int num = 0; num <= i; num++) {

				System.out.print(num);

			}
			

			System.out.println();
		}

	}

}
