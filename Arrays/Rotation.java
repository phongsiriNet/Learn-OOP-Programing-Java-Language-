package Arrays;
import java.util.Scanner;
public class Rotation {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int data[] = {1,2,3,4,5};
		int []newdata = new int[data.length];
		System.out.print("Number of rotatiom : ");
		int n = input.nextInt();

			for(int j=0;j<data.length;j++) {
				int newposition = (j+n)%data.length;
				newdata[newposition] = data[j];
			
			
		}
		
		for(int j=0;j<data.length;j++) {
		System.out.print(newdata[j]+" ");
		}
		

	}

}
