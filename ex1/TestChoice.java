package ex1;
import java.util.Scanner;
public class TestChoice {
	public static void main(String [] agrs) {
		int ans ;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter your choice ");
		int choice = input.nextInt();
		switch(choice) {
		case 0 :
		case 1 :
		case 2 : ans= choice;
				break;
		default : ans = -1;
		}
		if(ans!=-1) {
			System.out.println("Your choice :"+ans );
			System.out.print("Try again : " );
			
			System.out.print("Try again : " );
			
		}
		else { System.out.println("Invalid choice");
		
		}
	}

}
