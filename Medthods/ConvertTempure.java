package Medthods;
import java.util.Scanner;
public class ConvertTempure {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		double cen;
		System.out.print("Enter Centigrade:");
		 cen = input.nextDouble();
		System.out.println("Fahrenheit = "+CovertTemture(cen));

	}
	public static double CovertTemture(double x) {
		x = (9/5.0)*x+32;
		return x;
	}

}
