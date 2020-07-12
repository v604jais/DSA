package competetive;

import java.util.Stack;

public class BlancedCharacter {

	public static void main(String[] args) {

		String s = "(}{)[";
		
		Stack<Character> ele = new Stack<Character>();
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '{' || s.charAt(i) == '(' || s.charAt(i) == '[')
				ele.push(s.charAt(i));
		}
		System.out.println(ele);
        int size=ele.size();
        char[] Cbracket = s.toCharArray();
        
		while ( size--> 0) {
			char c = ele.pop();
			System.out.println(c);
			boolean flag=false;
			System.out.println(Cbracket);
			if(c=='{') {
			for (int i = 0; i < Cbracket.length; i++) {

					if (Cbracket[i] == '}') {
						Cbracket[i] = 'X';
						flag=true;
						
						break;
					}
					
			}
			if(flag) {
				System.out.println("Matched");
			}else {
				System.out.println("UN Matched for :"+c);
			}	
			}else if(c=='(') {
				for (int i = 0; i < Cbracket.length; i++) {

					if (Cbracket[i] == ')') {
						Cbracket[i] = 'X';
						flag=true;
						System.out.println("Matched");
						break;
					}
			}
				if(flag) {
					System.out.println("Matched");
				}else {
					System.out.println("UN Matched for :"+c);
				}
       }else {
    	   for (int i = 0; i < Cbracket.length; i++) {

				if (Cbracket[i] == ']') {
					Cbracket[i] = 'X';
					flag=true;
					System.out.println("Matched");
					break;
				}
       
    	   }if(flag) {
				System.out.println("Matched");
			}else {
				System.out.println("UN Matched for :"+c);
			}	
	}
   }
 }
}