package arrays;

public class Nbonaaci {

	public static void main(String[] args) {
		int M=8;
		int k=3;
		int currSum=0;
		
		
		for(int i=0; i<k;i++) {
			if(currSum==0) {
				System.out.print(currSum+" ");
				System.out.print(currSum+" ");
				currSum++;
				System.out.print(currSum+" ");
			}
			
			currSum+=i;
		   System.out.print(currSum+" ");
		    
		}
		
		for(int i=k;i<M;i++) {
			currSum+=i;
			System.out.print(currSum+" ");
		}
       
	}

}
