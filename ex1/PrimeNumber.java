package ex1;
import java.util.Scanner;
public class PrimeNumber {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	    int n = 56; // หาเลขจำนวนเฉพาะที่น้อยกว่าหรือเท่ากับ n
        System.out.println("เลขจำนวนเฉพาะที่น้อยกว่าหรือเท่ากับ " + n + " คือ:");
        
        for (int number = 2; number <= n; number++) {
        		boolean isPrime = true;
            for (int i = 2; i <= (int)Math.sqrt(number); i++) {
                if (number % i == 0) {
                    isPrime = false; 
                }
            }

            if (isPrime) {
                System.out.print(number + " ");
            }
        }
    }

	}


