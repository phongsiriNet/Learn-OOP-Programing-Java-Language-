package testClass;
import java.util.Scanner;
public class FortuneTest {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		char ch;
		int digit;
		String data;
		do {
			int sum =0;
		System.out.print("Enter your number phone or ID card number : ");
		data = input.next();
		for (int i =0; i<data.length();i++) {
			char c = data.charAt(i);
			if (Character.isDigit(c)){
				digit= Character.getNumericValue(c);
				sum += digit; 
			}
		}
		sum = sum/10;
		
		Fortune f1 = new Fortune();
		f1.setFortune(sum);
		f1.random();
		System.out.print("Do you want to continue : ");
		ch = input.next().charAt(0);
		}while(ch=='y');
		System.out.print("BYE BYE !! ");
	}

}
