package ex1;
import java.util.Scanner;
public class MultipleCase {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double num1=0,num2=0,result=0;
		char operator;
		boolean check = true;
		while(check) {
		System.out.println("Enter Number 1, operator and Number 2 ");
		System.out.print("Enter Number 1: ");
		num1 = input.nextDouble();
		System.out.print("Enter Number 2 :");
		num2 = input.nextDouble();
		if (num1==0 && num2==0) {
			System.out.println("End this program");
			break;
		}
		System.out.print("Operator: ");
		operator = input.next().charAt(0);
		switch (operator) {
		 	case '*': result = num1 * num2;
		 			break;
		 	case '+': result = num1 + num2;
		 			break;
		 	case '-': result = num1 - num2;
		 			break;
		 	case '/': result = num1 / num2;
		 			break;
		}
		System.out.println("The result is  "+result);
		
		}   
}}