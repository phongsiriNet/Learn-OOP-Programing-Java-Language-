package Arrays;

public class SummatonofArray {

	public static void main(String[] args) {
		int sum=0;
		int [] A = {7,3,5,2,9,8,11,4,1,6}, B= {9,8,11,4,1,6,7,3,5,2},c;
		c  = new int[A.length];
		for(int i = 0,j=9;i<A.length;i++,j--) {
			c[i] = A[i]*B[j];
			sum += c[i];
			System.out.print(c[i]+" ");
			if (i+1<A.length) System.out.print(" + ");
			else System.out.print(" = ");
		}
		System.out.print(sum);

	}

}
