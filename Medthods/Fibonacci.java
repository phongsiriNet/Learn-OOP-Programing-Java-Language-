package Medthods;
import java.util.Scanner;
public class Fibonacci {

	public static void main(String[] args) {
		int fibo;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a positive number : ");
		int data = input.nextInt();
		for(int i =1;i<=data;i++) {
		 fibo = fibonaci(i);
		 System.out.print(fibo+" ");
	}}
	
	public static int fibonaci(int x) {
		if (x==0) 
			return 0;
		if (x==1)
			return 1;
		else return fibonaci(x-2) + fibonaci(x-1);
		
		
	}
	}

