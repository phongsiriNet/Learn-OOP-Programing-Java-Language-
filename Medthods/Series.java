package Medthods;
import java.util.Scanner;
public class Series {

	public static void main(String[] args) {
		int result=0;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a positive number : ");
		int data = input.nextInt();
		
		 result = calseries(data);

		
		System.out.print("Sum is: "+result);
	}
	public static int calseries(int x) {
		
		if (x==1) 
			return 1;
		else 
			
			return calseries(x-1) + (x*2)-1;
			
		
	}

}
