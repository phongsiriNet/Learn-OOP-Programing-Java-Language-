package Arrays;
import java.util.Scanner;
public class ReceiveGrade {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		char [][] grade = new char[2][5];
		for(int i = 0;i<grade.length;i++) {
			for(int j = 0; j<grade[i].length;j++) {
				System.out.print("Student No."+(i+1)+" subject "+(j+1)+" : ");
				 grade[i][j] = input.next().charAt(0);
			}
		}
		AllA(grade);
		atleastOneA(grade);
		find(grade);
	}
	public static void AllA(char[][] alla) {
		
		for(int i = 0;i<alla.length;i++) {
			int count =0;
			for(int j=0;j<alla[i].length;j++) {
				if (alla[i][j]=='A')
					count++;
				if(count==alla[i].length)
					System.out.println("Student number"+(i+1)+" get all A");
			}
			
		}
		
	}
	public static void atleastOneA(char[][] alla) {
		for(int i = 0;i<alla.length;i++) {
			int count =0;
			for(int j=0;j<alla[i].length;j++) {
				if (alla[i][j]=='A')
					count++;
				
			}
			if(count>=1)
				System.out.println("Student number"+(i+1)+" atleast one A");
			
		}
		
		
	}
	public static void find(char[][] alla) {
		
		for(int j = 0;j<alla[0].length;j++) {
			int count =0;
			for(int i=0;i<alla.length;i++) {
			
				if (alla[i][j]=='A')
					count++;
				
			}
			if(count==2)
				System.out.println("atleast 2A in one subject "+(j+1));
			
		}
		
		
	}
}
