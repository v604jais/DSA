package arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;



public class MultiArray {

	public static void main(String[] args) {
		
		
		String d="123A";
		int D=Integer.parseInt(d);
		System.out.print(D);
		Integer a[]= {1,2,3,4};
		Integer b[]= {5,6,7};
		Integer c[]= {8,9,10};
		
		List<Integer> A=Arrays.asList(a);
		List<Integer> B=Arrays.asList(b);
		List<Integer> C=Arrays.asList(c);
		
		Map<Integer, List<Integer>> map= new HashMap<>();
       
		map.put(0, A);
		map.put(1, B);
		map.put(2, C);
		System.out.println(map.get(1).get(1));
		
		
	}

}
