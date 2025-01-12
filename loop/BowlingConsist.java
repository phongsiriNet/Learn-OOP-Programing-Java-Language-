package loop;
import java.util.Scanner;
public class BowlingConsist {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int total =0;
		for (int ga = 1;ga<=3;ga++) 
			System.out.print("\t\tGame"+ga); 
			for(int py=1;py<=5;py++) {
				System.out.println(""); 
				System.out.print("Bowlwr:"+py); 
				int g1 = input.nextInt();
				int g2 = input.nextInt();
				int g3 = input.nextInt();
				 total += g1+g2+g3;
				
		
			}
			double avg = total/15.0;
			System.out.println("Average team score is "+avg); 
	}

}
