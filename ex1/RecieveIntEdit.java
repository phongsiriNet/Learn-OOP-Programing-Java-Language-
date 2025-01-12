package ex1;
import java.util.Scanner;
public class RecieveIntEdit {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		boolean check = true;
		int data,sum=0;
		while(check) {
			System.out.print(" Enter integer number :");
			data = input.nextInt();
			if (data<0) {
				System.out.print(" Invalid");
				check =false;
			}else sum = sum + data;
			System.out.println(" The sum is :"+sum);
		
		}
	}

}
