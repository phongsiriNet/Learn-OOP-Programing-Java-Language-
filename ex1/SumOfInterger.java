package ex1;

import java.util.Scanner;

public class SumOfInterger {


	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int sum=0,data=0;
		boolean  done = true;
		while (done) {
			System.out.print(" Enter integer number :");
			data = input.nextInt();
			if (data == -999) 
				done = false;
			else sum = sum + data ;
			
		}
		System.out.println(" The sum is :"+sum);
	}}
