package ex1;
import java.util.Scanner;
public class Average {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println(" Press 9999 for averaging ");
		int num=0,i=0;
		boolean check = true;
		double sum=0.00;
		do {
			num = input.nextInt();
			sum = sum + num ;
			i++;
		}while(num!=9999);
		double average = sum/i;
		System.out.print(" Average = "+average);
	}

}
