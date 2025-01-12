package Medthods;
import java.util.Scanner;
public class Mathpow {

	public static void main(String[] args) {
		int pow;
		double base;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a base number:  ");
		base = input.nextInt();
		System.out.print("Enter a power number:  ");
		pow = input.nextInt();
		double result = power(base,pow);
		
		System.out.print(base+" raised to the power"+pow+" ="+result);

	}
	public static double power(double x,int p) {
		return Math.pow(x, p);
	}
}
