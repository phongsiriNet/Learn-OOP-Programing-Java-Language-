package Arrays;
import java.util.Scanner;
public class AverageOfArray {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int [] num ;
		int sum=0;
		num = new int[10];
		for(int i =0;i<num.length;i++) {
		System.out.print("Enter Number"+(i+1)+ ":");
		num[i] = input.nextInt();
		sum += num[i];
	}
	double average = sum/10.0;
	System.out.println("average = :"+average);
	}
}
