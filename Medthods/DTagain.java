package Medthods;
import java.util.Scanner;
public class DTagain {

	public static void main(String[] args) {
		int x=0;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter n :");
		int n = input.nextInt();
		for (int i = 1;i<=n;i++) {
			boolean be = isBetween6And12();
			if (be)
				x++;
			System.out.println();
		}
		double avg = (x/(double)n)*100;
		System.out.println("Percentage = "+avg+" %");
	}
	public static boolean isBetween6And12() {
		int sum =0;
		for (int i=1;i<=3;i++) {
			int die = (int)(Math.random()*6)+1;
			System.out.print(die+" ");
			sum += die;
		}
		if (sum>6&&sum<12) {
			System.out.print(" Between 6 And 12");
			return true;
		}else {
			System.out.print(" Out of range");
			return false; 
		}
	}
}
