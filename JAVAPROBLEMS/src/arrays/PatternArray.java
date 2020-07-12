package arrays;

import java.util.Scanner;

public class PatternArray {

	         /*
	          * pattern is 
	          *       0
	          *      101
	          *     21012
	          * 
	          * 
	          * 
	          */
	
	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		System.out.println(" Enter the height of Pyramid ");
		int n = input.nextInt(); 
		input.close();
		int var1=1,var2=1;
		//one loop to iterate given size of pyramid 
		for(int i=0; i <n;i++) {
		  //one inner loop for the space
			for(int space=n-1; space>i;space--) {
				System.out.print(" ");
			}
		   //one inner loop to perform operation and print
			for(int k=1;k<=var1;k++) {
				System.out.print(Math.abs(k-var2));
			}
			var1+=2;
			var2++;
			System.out.println();
		}
		
	}

}
