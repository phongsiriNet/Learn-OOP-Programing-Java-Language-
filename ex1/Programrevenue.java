package ex1;
import java.util.Scanner;
public class Programrevenue {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	char ch='y';
	double rev=0,tax=0;
	do {
		System.out.print("Input your revenue: ");
		rev = input.nextDouble();
		if (rev<=80000) {
			System.out.println("Taxrate = 0%");
			tax = rev * 0;
			System.out.println("Your tax = "+tax);
		}else if(rev<=100000) {
			System.out.println("Taxrate = 5%");
			tax = rev * 0.05;
			System.out.println("Your tax = "+tax);
		}else if(rev<=500000) {
			System.out.println("Taxrate = 10%");
			tax = rev * 0.10;
			System.out.println("Your tax = "+tax);
		}else if(rev<=1000000) {
			System.out.println("Taxrate = 15%");
			tax = rev * 0.15;
			System.out.println("Your tax = "+tax);
		}else {
			System.out.println("Taxrate = 20%");
			tax = rev * 0.20;
			System.out.println("Your tax = "+tax);
		}
		System.out.print("Continue[y/n]: ");
		ch = input.next().charAt(0);
	}while(ch=='y');
		System.out.print("Bye Bye !!!: ");
	}

}
