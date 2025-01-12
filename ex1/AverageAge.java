package ex1;
import java.util.Scanner;
public class AverageAge {

	public static void main(String[] args) {
		int sum=0,age;
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
			
		double average=0.00;
		Scanner input = new Scanner(System.in);
		System.out.print(" Enter integer number :");
		int num = input.nextInt();
		for (int i=1;i<=num;i++) {
			System.out.print(" Enter Age:");
			age = input.nextInt();
			sum =  sum +  age;
			average = sum / i ;
			if (age>max) 
				max = age;
			if (age<min) 
				min = age;
			
			
		}
		System.out.println("Maximum age is"+max);
		System.out.println("Minimum age is"+min);
		System.out.println("Average"+average);

	}

}
