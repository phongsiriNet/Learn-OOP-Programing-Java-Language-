package loop;
import java.util.Scanner;
public class MQC {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	char ch;
	int i =0;
	int num = 0;
	double cen=0,max=Double.MIN_VALUE;
	do {
		i++;
		System.out.print("No."+i+" Enter height :");
		char unit= input.next().charAt(0);
		if (unit=='f') {
			int foot = input.nextInt();
			int inches =input.nextInt();
			cen = ConvertF2c(foot,inches); 
		}else if(unit=='c')
			cen = input.nextDouble();
		
		System.out.print("No."+i+" is "+cen+" cm");
		
		if(cen>max) {
			max = cen;
			num = i;
			
		}
		System.out.println();
	System.out.print("Do you want to continue[y/n]");
	ch = input.next().charAt(0);
		
	}while(ch=='y');
	System.out.print("No."+num+" is tallest");
	}
	public static double ConvertF2c(int f,int in) { 
		return ((5*12)+4)*2.54;
	}
}
