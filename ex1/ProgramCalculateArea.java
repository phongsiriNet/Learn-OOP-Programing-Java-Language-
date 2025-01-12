package ex1;
import java.util.*;
public class ProgramCalculateArea {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		final double pi = 3.141592653589793238462643383279502884197;
		int num=0;
		double area =0,w,h,r;
		System.out.println("Program calculate area");
		System.out.println("===========================");
		System.out.println("Press 1: Square");
		System.out.println("Press 2: Rectangle");
		System.out.println("Press 3: Triangle");
		System.out.println("Press 4: Circle");
		System.out.println("Press 5: Exit");
		do {
			System.out.print("Press Number:");
			num = input.nextInt();
			switch(num) {
				case 1 : System.out.print("Please enter width :");
						  w = input.nextDouble();
						  area = w * w;
						  System.out.println("Area = "+area);
						  break;
				case 2 : System.out.print("Please enter width and height :");
						w = input.nextDouble();
						h = input.nextDouble();
						area = w * h;
						System.out.println("Area = "+area);
						break;
				case 3 : System.out.print("Please enter width and height :");
				  		w = input.nextDouble();
				  		h = input.nextDouble();
				  		area = w * h * (1/2.0);
				  		System.out.println("Area = "+area);
				  		break;
				case 4 : System.out.print("Please enter radius :");
				  		r = input.nextDouble();
				  		area = pi*r * r;
				  		System.out.println("Area = "+area);
				  		break;
				 default: break;
			}
		}while(num!=5);
		System.out.print("Bye Bye !!!");
	}

}
