package Arrays;
import java.util.Scanner;
public class ListOfInteger {

	public static void main(String[] args) {
		int sum =0;
		Scanner sc = new Scanner(System.in);
		System.out.println("How many numbers you will enter ?");
		int number = sc.nextInt();
		int list [] = new int[number];
		System.out.println("Enter "+list.length+" integer, one per line: ");
		for (int i =0;i<list.length;i++) {
			list[i] = sc.nextInt();
			sum += list[i];
		}
		System.out.println("The sum is "+sum+".");
		for (int i =0;i<list.length;i++) 
			System.out.println("The number are :\n"+list[i]+"\t "+((double)list[i]/sum)*100 +"% of the sum." );
		

	}

}
