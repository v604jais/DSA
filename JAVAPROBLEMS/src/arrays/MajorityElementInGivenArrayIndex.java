package arrays;

public class MajorityElementInGivenArrayIndex {

	public static void main(String[] args) {

		int a[] = { 1, 2, 3, 4, 2, 2,2};

		int n = a.length / 2;

		majorityElement(a, n);

	}

	private static void majorityElement(int a[], int sizeBy2) {
		boolean flag=false;
		for (int i = 0; i < a.length; i++) {
			 
			int count = 1;
			
			for (int j = i + 1; j < a.length; j++) {

				if (a[j] == a[i]) {
					count++;
				}
				if(count>sizeBy2) {
					System.out.println(i);
					flag=true;
				}
				
			}
			
		} if(!flag) {
			System.out.println("No Majority Element");
		}
      
	}

}
