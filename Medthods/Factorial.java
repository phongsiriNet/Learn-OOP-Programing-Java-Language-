package Medthods;
import java.util.Scanner;
public class Factorial {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.print("Enter a positive number : ");
	int data = input.nextInt();
	double result = Factorail(data);
	System.out.print("factorail of  "+data+" is :"+result);

	}
	public static double Factorail(int x) {
		if (x==0)
			return 1;
		else return x *Factorail(x-1);
	}
}
