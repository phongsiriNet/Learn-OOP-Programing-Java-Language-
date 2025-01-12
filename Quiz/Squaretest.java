package Quiz;
import java.util.*;
public class Squaretest {

	public static void main(String[] args) {
		int [] side = {4,5,7,8,6,4,10,2,8,6,10,7};
		Square[] sqr = new Square[side.length];
		for(int i = 0;i<sqr.length;i++) {
			sqr[i] = new Square();
			sqr[i].setSide(side[i]);
		}
		for(int i=0;i<sqr.length;i++) {
			System.out.println("Square Characteristics");
			System.out.printf("Side:      %.2f\n",sqr[i].getSide() );
			System.out.printf("Perimeter: %.2f\n",sqr[i].calculatePerimeter());
			System.out.printf("Area:      %.2f",sqr[i].calculateArea());
			System.out.println("\n");
		}

	}

}
