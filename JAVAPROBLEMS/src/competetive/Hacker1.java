package competetive;

import java.io.IOException;
import java.util.Scanner;

public class Hacker1 {

	public static char readInput() {
		
		char c='\u0000';
		int input=0;
		System.out.println("Before Returning c :"+c);
		try {
			//Scanner read= new Scanner(System.in);
			input =System.in.read();
			if(input !=-1) {
				c=(char)input;
			}
		}catch(IOException e) {
			System.out.println(e.getMessage());
		}
       return c;
	}
	
	
	public static void main(String[] args) {
		
		char c =Hacker1.readInput();
		System.out.println(c);

	}

}
