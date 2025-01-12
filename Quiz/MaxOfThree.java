package Quiz;
import java.util.Scanner;
public class MaxOfThree {

	public static void main(String[] args) {
		  int x1,x2,x3;
		  int max;
		Scanner input = new Scanner (System.in); 
		 System.out.print("Enter 3 numbers: ");
		 x1 = input.nextInt();
		 x2 = input.nextInt();
		 x3 = input.nextInt();
		 max = max3(x1,x2,x3);
		 System.out.print("Maximum: " + max);
		 
	}
	public static int max3(int a,int b,int c) {
		int max=a;
		if(b>max)
			max=b;
		 if (c>max)
			max=c;
		
		return max;
		
	}
}
