package Medthods;
import java.util.Scanner;
public class CalTripplex {

	public static void main(String[] args) {
		boolean check = false;
		Scanner input = new Scanner(System.in);
		while(!check) {
			System.out.print("Enter a positive number 1 : ");
			int num1 = input.nextInt();
			System.out.print("Enter a positive number 2 : ");
			int num2 = input.nextInt();
			if (num2<num1) {
				System.out.println("Invalid");
				check=false;
			}else {
				trippleX(num1,num2);
				check = true;
		}}
	}
	public static void trippleX(int start,int stop) {
		for (int i =start;i<=stop;i++) {
			int result = i*i*i;
			System.out.println(i+ " "+result);
		}
	}

}
