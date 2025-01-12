package ex1;
import java.util.*;
public class ConvertInt {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	int num=1;
	do {
		System.out.print("Press Number:");
		num = input.nextInt();
		while(num>=1000) {
			System.out.print("M");
			num-=1000;	
		}
		while(num>=500) {
			System.out.print("D");
			num-=500;	
		}
		while(num>=100) {
			System.out.print("C");
			num-=100;	
		}
		while(num>=50) {
			System.out.print("L");
			num-=50;	
		}
		while(num>=10) {
			System.out.print("X");
			num-=10;	
		}
		while(num>=5) {
			System.out.print("V");
			num-=5;	
		}
		while(num>=4) {
			System.out.print("IV");
			num-=4;	
		}
		while(num>=1) {
			System.out.print("I");
			num-=1;	
		}
		System.out.println("");
	}while(num==0);

	}}
