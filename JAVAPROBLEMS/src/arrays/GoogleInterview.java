package arrays;

import java.util.Scanner;

public class GoogleInterview {

	public static void main(String[] args) {
		
		//System.out.println(i+"+"+i+"="+sum);
		Scanner input= new Scanner(System.in);
		int n = input.nextInt(); 
		
		for (int i=1; i<=n;i++) {
			int sum=0;
			
			for(int j=1;j<=i;j++) {
				sum+=j;
				if(i==1)
				System.out.print(j);
				else if(j<=i&&j>1)
				System.out.print("+"+j);
				else 
					System.out.print(j);
				
			}
			
			System.out.print("=");
			System.out.print(sum);
			System.out.println();
			}
			
		}
	}

