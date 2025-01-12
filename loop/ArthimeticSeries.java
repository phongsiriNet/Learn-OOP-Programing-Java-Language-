package loop;
import java.util.Scanner;
public class ArthimeticSeries {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	int sum=0;
	System.out.print("Enter a :");
	int a = input.nextInt();
	System.out.print("Enter d :");
	int d = input.nextInt();
	System.out.print("Enter n :");
	int n = input.nextInt();
	int i=0;
	int term = a;
	while(i<n) {
			System.out.print(term+" " );
			sum+= term;
			if(i<n-1) System.out.print("+" );
			else System.out.print("=" );
			i++;
			term=(a+(i*d));
			
			
		
		
	}
	System.out.print(sum );
	}

}
