package loop;
import java.util.Scanner;
public class Geometric {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		float sum=0;
		double r =0;
		System.out.print("Enter a :");
		int a = input.nextInt();
		System.out.print("Enter r :");
		r= input.nextDouble();
		System.out.print("Enter n :");
		int n = input.nextInt();
		int i=0;
		float term = a;
		while(i<n) {
			term = a * (float)Math.pow(r,i);
			System.out.print(term +" ");
			i++;
			if (i<=n-1) 
				System.out.print("+");
			else 
				System.out.print("=");
			sum +=term;
			
		}
		System.out.print(sum +" ");
	}

}
