package Arrays;
import  java.util.Scanner;
public class CharArray {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		char [] point;
		point = new char[5];
		for(int i =0;i<point.length;i++) {
			 System.out.print("Enter a charecter:");
			 point[i] =  input.next().charAt(0);
			}
		
		for(int i =0;i<point.length;i++) {
			 System.out.print( point[i] +" ");
			
			}
	}

}
