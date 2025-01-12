package testClass;
import java.util.Scanner;
public class TestPizza {

	public static void main(String[] args) {
		int diameter;
		char check;
		String topping;
		double total =0;
		Scanner sc = new Scanner(System.in);
		do {
		System.out.print("Enter your size : ");
		diameter = sc.nextInt();
		sc.nextLine();
		System.out.print("Enter your toping : ");
		topping = sc.nextLine();
		Pizza o1 = new Pizza();
		o1.setDiameter(diameter);
		o1.setToppings(topping);
		o1.calPrice();
		System.out.println(""+o1.toString());
		total +=o1.getPrice();
		System.out.println("Total :"+total);
		System.out.print("Do you want to continue ");
		check=sc.next().charAt(0);
		}while(check == 'y');

	}

}
