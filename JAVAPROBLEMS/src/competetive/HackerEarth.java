package competetive;

public class HackerEarth {

	int setValue() {
		int a=10;
		int b=20;
	try {
		
	      ++a;
	      b++;
	
	}catch( Exception e) {
		System.out.println(e.getMessage());
	}
	finally {
		a++;
		b--;
	}
	return a+b;
}

	
	public static void main(String[] args) {
		HackerEarth h= new HackerEarth();
		System.out.println(h.setValue());

	}

}
