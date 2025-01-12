package loop;
import java.util.Scanner;
public class PrimeNumber {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		boolean prime = false;
		System.out.print("Enter 2 integer number :  ");
		for (int i =1;i<=2;i++) {
		 int num = input.nextInt();
		 prime = isPrime(num);
		 if (prime) 
			 System.out.println("No."+i+"Prime numer  ");
		 else 
			 System.out.println("No."+i+"Not prime number ");
	}}
	public static boolean isPrime(int n) {
		if (n<=1) 
			return false;
		else  if (n==2) 
			return true;
		if (n%2==0) 
			return false;
		for (int i =3;i*i<=n;i+=2) {
			if(n%i==0) return false;
		}
		return true;
	}
}
