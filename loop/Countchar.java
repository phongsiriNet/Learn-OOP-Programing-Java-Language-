package loop;
import java.util.Scanner;
public class Countchar {

	public static void main(String[] args) {
		int charcount=0;
		char ch;
		boolean check =true;
		Scanner input = new Scanner(System.in);
		System.out.print(" Enter charecter :");
		while(check) {
			
			ch = input.next().charAt(0);
			if(ch=='x') {
				System.out.print(" Do u want to exit  :");
				char con = input.next().charAt(0);
				 	if (con=='y') check = false;
				 	if (con=='n') System.out.print(" continue");
				 	charcount--;
			}
			charcount++;
		
		}
		System.out.print(" Number of  charecter :"+charcount);
	}}


