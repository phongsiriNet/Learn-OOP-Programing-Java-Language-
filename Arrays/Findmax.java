package Arrays;
import java.util.Scanner;
public class Findmax {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int [] rec = new int[10];
		for (int i =0;i<rec.length;i++) {
			System.out.print("Enter Number"+(i+1)+ ":");
			rec[i] = input.nextInt();
	}
		findmax(rec);
	}
	public static void findmax(int[] a) {
		int max = a[0];
		int pos = 0;
		for (int i=1;i<a.length;i++) {
			if(max<a[i]) {
				max = a[i];
				pos = i; 
			}
			
		}
		System.out.println("Maximum number is "+max+" at position "+pos);
		
	}
}
