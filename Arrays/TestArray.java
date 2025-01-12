package Arrays;
import java.util.Scanner;
public class TestArray {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int [] A = new int[n];
		
		for(int i=0;i<A.length;i++) 
			A[i] = input.nextInt();
		
		print(A);
		
			int max = A[0];
			int sum =0;
		for(int i=0;i<A.length;i++) {
			sum += A[i];
			if(max<A[i])
				max = A[i];
		}
		System.out.println("Maximum number is "+max);
		
		int [] B = new int[A.length];
		for(int i=0;i<A.length;i++) 
			B[i] = A[i] ;
		
		print(B);
		
	}
	public static void print(int [] n) {
		
		
		for(int i =0;i<n.length;i++) {
			System.out.print(n[i]+" ");
			
		}
		System.out.println("");
	}


}
