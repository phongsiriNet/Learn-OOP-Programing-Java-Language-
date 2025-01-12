package testClass;
import java.util.Scanner;
public class Cal {

	public static void main(String[] args) {
		int x1,x2,y1,y2;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter x1 y1 :");
		x1 = sc.nextInt();
		y1 = sc.nextInt();
		System.out.print("Enter x2 y2 :");
		x2 = sc.nextInt();
		y2 = sc.nextInt();
		Line o1 = new Line(y1,x1,y2,x2);
		System.out.println(" "+o1.toString());
	}

}
