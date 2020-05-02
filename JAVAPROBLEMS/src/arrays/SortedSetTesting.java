package arrays;
import  java.util.*;
public class SortedSetTesting {

	public static void main(String[] args) {
		
		String s="welcometojava";
		int k=3;
		SortedSet<String> sets=new TreeSet<String>();
         for(int i=0;i<=s.length()-k;i++){
             sets.add(s.substring(i,i+k));
            }
          System.out.println(sets);
          System.out.println(sets.first());
          System.out.println(sets.last());
          
	}

}
