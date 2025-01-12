package Arrays;

public class twoTimesArray {

	public static void main(String[] args) {
		int [] A = {3,6,12,-2,14,7,8,9,2};
		print(A);
		for(int i =0;i<A.length;i++) 
			A[i]=A[i]*2;
			
		print(A);
		
	}
	public static void print(int [] n) {
		
			
		for(int i =0;i<n.length;i++) {
			System.out.print(n[i]+" ");
			
		}
		System.out.println("");
	}

}
