package competetive;

import java.util.HashMap;
import java.util.LinkedList;

public class Map {

	public static void main(String[] args) {
		
		HashMap<Integer, LinkedList<String>> map= new HashMap<>();
		LinkedList<String> list= new LinkedList<>();
		list.add("Vishal");
		list.add("Suddu");
		list.add("SRI");
		LinkedList<String> list2= new LinkedList<>();
		list2.add("RAJA");
		list2.add("SIDHA");
		list2.add("SRI");
		map.put(1,list);
		map.put(2,list2);
        
		System.out.println(map.get(2).get(1));
	}

}
