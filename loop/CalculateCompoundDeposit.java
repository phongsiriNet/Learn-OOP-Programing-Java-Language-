package loop;
import java.util.Scanner;
public class CalculateCompoundDeposit {

	public static void main(String[] args) {
		double dep=0;
		Scanner input = new Scanner(System.in);
		System.out.print(" Enter Amount:");
		double amou = input.nextDouble();
		System.out.print(" Enter Rate:");
		double rate = input.nextDouble();
		System.out.print(" Enter Year:");
		int y = input.nextInt();
		System.out.println("=====================================");
		System.out.print(" Year			Deposit");
		System.out.print(" \n=====================================\n");
		for(int i =1;i<=y;i++) {
		dep += amou*Math.pow((1+(rate/100)),y);
			System.out.println(i+"			"+dep);
		}
		
		
		

	}

}
