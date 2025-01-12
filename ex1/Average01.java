package ex1;
import java.util.Scanner;
public class Average01 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double sum=0.0,average=0.0;
		for(int i=1;i<=10;i++) {
			System.out.print("Enter number:");
			double data = input.nextDouble();
			 sum = sum + data;
		}
		average = sum /10;
		System.out.print("Average = "+average);

	}

}
