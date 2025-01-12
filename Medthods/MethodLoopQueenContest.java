package Medthods;
import java.util.Scanner;
public class MethodLoopQueenContest {

	public static void main(String[] args) {
		char ch,unit;
		double cen=0,max=Double.MIN_VALUE;
		int num=0,i=0;
		Scanner input = new Scanner(System.in);
		do {
			i ++;
			
			System.out.print("No."+i+" Enter height:");
			unit = input.next().charAt(0);
			if (unit=='f') {
				int foot = input.nextInt();
				int inch = input.nextInt();
				cen = Foot2Cm(foot,inch);
			}else if (unit =='c')
				cen =input.nextDouble();
			
			if (cen>max) { 
				max=cen;
				num= i;
			}
		System.out.println("No."+i+" is "+ cen+"cm");
					
		System.out.print("Do you want to continue[y/n]:");		
		ch = input.next().charAt(0);
		
			
		}while(ch=='y');
		System.out.println("No."+num+" is tallest");
		System.out.println("Bye Bye!!");
		
	}
	public static double Foot2Cm(int foot, int inch) {
	double cen = ((foot*12)+inch)*2.54;
	return cen;
	}
}
