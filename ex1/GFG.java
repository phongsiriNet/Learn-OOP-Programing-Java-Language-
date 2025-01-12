package ex1;


	// Java Program to Swap Two values using third variable
	// using temp variable

	// Importing generic libraries
	import java.util.*;

	class GFG {

			public static void main(String[] args) {
				Scanner input = new Scanner(System.in);
				char c1,c2,c3;
				int char1=0,char2=0,char3=0;
				System.out.print("Enter A B C : ");
				c1 = input.next().charAt(0);
				c2 = input.next().charAt(0);
				c3 = input.next().charAt(0);
			if ((c1=='A') || (c1=='a')) {
				 char1 =10;	
			}else if ((c1=='B') || (c1=='b')) {
				 char1 =20;
			}else if ((c1=='C') || (c1=='c')) {
				 char1 =30;
}
			if ((c2=='A') || (c2=='a')) {
				 char2 =10;	
			}else if ((c2=='B') || (c2=='b')) {
				 char2 =20;
			}else if ((c2=='C') || (c2=='c')) {
				 char2 =30;
}
			if ((c3=='A') || (c3=='a')) {
				 char3 =10;	
			}else if ((c3=='B') || (c3=='b')) {
				 char3 =20;
			}else if ((c3=='C') || (c3=='c')) {
				 char3 =30;
}
			int sum = char1 + char2 + char3;
			System.out.print("The value of result is:  "+sum);
		}
		}
