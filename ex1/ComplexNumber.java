package ex1;
import java.util.Scanner;
import java.text.DecimalFormat;
public class ComplexNumber {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double num;
		System.out.print("Input number with 2 floating point: ");
		num = input.nextDouble();
		 DecimalFormat decimalFormat = new DecimalFormat("0.00");
		
			while (num+3.33<=30.0) {
				String formattedNumber = decimalFormat.format(num);
				System.out.println(num+"  + 3.33 = "+formattedNumber);
				num = num + 3.33;
				
				
			}
		
			System.out.print(" Sorry! No more than 30.00");
	
	
	
	
	}
			
		
		
		

	}


