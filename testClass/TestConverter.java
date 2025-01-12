package testClass;
import java.util.Scanner;
public class TestConverter {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double a,b;
		String fc,tc;
		int i=0;
		double [] data = new double[3];
		while(i<5) {
		System.out.print("Enter your currency and amout :");
		fc = input.next();
		a = input.nextDouble();
		System.out.print("Enter your what currency you want to convert is and rate :");
		tc = input.next();
		double rate = input.nextDouble();
		
	
		Converter c1 = new Converter(fc, tc, a);
		c1.setRate(tc, rate);
		System.out.println(""+c1.toString()+" the result is "+c1.getResult());
		data[i] = c1.getResult();
		i++;
		}
		for(int j =0;j<data.length;j++) {
			System.out.print(data[j]+" ");
			if(j<data.length-1) System.out.print(", ");
			
		}
	}

}
