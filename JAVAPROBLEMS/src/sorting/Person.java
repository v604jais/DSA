package sorting;

import competetive.Deer;

public class Person {

	public void hunt() {
		Deer d= new Deer();
		d.play();
	}
public static void main(String[] args) {
		
		/*Person p= new Person();
		
		p.hunt();*/
	     int arr[]= {4,2};
	     for(int e:arr)
	    	 System.out.print(e+" ");
	     MergeSort.mergeSort(arr, 0, 1);
	     for(int e:arr)
	    	 System.out.print(e+" ");
		
	}

	
}
