package ex1;
import java.util.Scanner;
public class Ass {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int b1000=0,b500=0,b100=0,b50=0,b20=0;
		System.out.print("10 coin:");
		int t10 = input.nextInt();
		System.out.print("5 coin:");
		int f5 = input.nextInt();
		System.out.print("2 coin:");
		int t2 = input.nextInt();
		System.out.print("1 coin:");
		int o1 = input.nextInt();
		int total = (10*t10)+(5*f5)+(10*t2)+(10*o1);
		System.out.println("Total :"+total);
		int money =total;
		if (total>1000) {
			if (money%500!=0) {
			b1000=total/1000;
			money = total%1000;
			}
		} if (money>500) {
			b500=money/500;
			money = money%500;
		} if(money>100) {
			b100=money/100;
			money = money%100;
		} if (money>50) {
			if(money%20!=0) {
			b50=money/50;
			money = money%50;
			}
		}if (money>=20)
			b20=money/20;
		System.out.println("money : "+money);
		System.out.println("Bank 1000: "+b1000);
		System.out.println("Bank 500: "+b500);
		System.out.println("Bank 100: "+b100);
		System.out.println("Bank 50: "+b50);
		System.out.println("Bank 20: "+b20);
			

	}

}
