package Medthods;
import java.util.Scanner;
public class DiceToss {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n=0,x=0; boolean be;
		System.out.print(" Enter n :");
		n = input.nextInt();
		for(int i =1;i<=n;i++) {
			be = isBetween6And12();
			if (be)
				x++;
	}
		double percen = (x/(double)n)*100;
		System.out.println("Percentage "+percen+"%");
		
 }
	public static boolean isBetween6And12() {
		int sum=0;
		for(int i=1;i<=3;i++) {
			int die = (int) (Math.random()*6)+1;
			System.out.print(die+" ");
			sum += die;
		}
				if (sum>6 && sum<12 ) {
					System.out.println(" Between 6 And 12");
					return true; 
					
				}else {
					System.out.println(" Out of Range");
					return false;
		}
			
		
	}

}
