package ex1;
import java.util.Scanner;
public class dd {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// TODO Auto-generated method stub
		 int choice; int w,h,r; double area;
		System.out.println("enter message: ");
		System.out.println("Progam calculate area");
		System.out.println("=====================================");
		System.out.println("Press 1: Square");
		System.out.println("Press 2: Rectangle");
		System.out.println("Press 3: Exit");
		do {
			 System.out.print("Press Number:");
			 choice = input.nextInt();
			 switch (choice) {
			 	case 1 : System.out.print ("Please enter Width:");
			 		w = input.nextInt();
			 		area = w*w;
			 		System.out.print ("Area = " +area);
			 		break;
			 	case 2 :  System.out.print ("Please enter Width and Height:");
			 		 w = input.nextInt();
			 		 h = input.nextInt();
			 		 area = w*h;
			 		 System.out.print ("Area = " + area);
			 		 break;
			 	 default: System.out.print ("Bye Bye !!\n");
			 	 
			 		
			 }
			 System.out.println();
			 
		}while(choice!=3);
		

	}

}
