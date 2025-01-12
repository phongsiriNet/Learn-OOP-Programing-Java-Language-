package Quiz;
import java.util.Scanner;
class CheckGreaterThan10 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n; boolean isOver;
		System.out.print ("Enter number of n: ");
		n = input.nextInt();
		isOver=isGreaterThan10(n);
		if (isOver)
			 System.out.print (n + " is greater than 10.");
		else 
			  System.out.print ( n + " is less than or equal 10.");

	  
	}
	public static boolean isGreaterThan10(int n) {
		boolean ans = (n>10);
		return ans;
	}

}
