package Arrays;

public class Pretest {
	public static void main(String [] agrs) {
		int []A = {3,6,12,-2,14,7,8,9,2};
		printArray(A);
		for(int i=0;i<A.length;i++)
			A[i] =A[i]*2;
		printArray(A);
		
	}
	public static void printArray(int []aa) {
		for(int i=0;i<aa.length;i++)
			System.out.print("A"+i+" "+aa[i]);
		
			System.out.println(" ");
	}

}
