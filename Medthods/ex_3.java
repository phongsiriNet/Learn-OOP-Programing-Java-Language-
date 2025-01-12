package Medthods;
import java.util.Scanner;
public class ex_3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num=6,sub=5,atleastone=0,s2A=0;
		boolean allA = true;
		for(int i =1;i<=num;i++) {
			for (int j = 1 ; j<=sub;j++) {
				System.out.print("Enter  grade for student "+i+ "subject  "+j+": ");
				char g = input.next().charAt(0);
				allA = CheckAllA(g);
				atleastone += alo(g);
				
					
				
				
			}
			if (allA)
				System.out.println("Number of Student got all A:  "+i);
			if (atleastone>=1)
				System.out.println("Number of Student got atleast one A:  "+i);
		}
}
	public static boolean CheckAllA(char g) {
		if (g =='A'||g=='a') 
			return true;
		else return false;
		
	}public static int alo(char g) {
		if (g =='A'||g=='a') 
			return 1;
		else return 0;
	}

}
