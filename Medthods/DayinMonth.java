package Medthods;
import java.util.Scanner;
public class DayinMonth {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter month in an Interger : ");
		int data = sc.nextInt();
		if (data >12 || data <0)
			System.out.println("Invalid number");
		
		/*int numberOfDay = dayInMonth(data);*/
		System.out.println("Number of day in "+data +" month is "+dayInMonth(data));
		

	}public static int dayInMonth(int month) {
		int numOfDay;
		switch (month) {
		case 1 :
		case 3 :
		case 5 :
		case 7 :
		case 8 :
		case 12: numOfDay = 31;
				break;
		case 2 : numOfDay = 28;
		default : numOfDay = 30;
		}
		
		return numOfDay;
	}

}
