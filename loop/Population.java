package loop;
import java.util.Scanner;
public class Population {

	public static void main(String[] args) {
		int dataA=0, dataB=0,rateA=0,rateB=0,i=0;
		boolean check=true,ba=false,amb=false;
		Scanner input = new Scanner(System.in);
			do {	
			System.out.print("Population of town A =  ");
			 dataA = input.nextInt();
			System.out.print("Population of town B =  ");
			 dataB = input.nextInt();
			 if (dataA>dataB) {
				 
				 System.out.println("Invalid");
				 amb =true;
			 }else amb = false;
			 
			 }while (amb);	
			System.out.print("Growth rate of town  A(%) =  ");
			 rateA = input.nextInt();
			System.out.print("Growth rate of town  B(%) =  ");
			 rateB = input.nextInt();
				 while (dataA<dataB) {
						i++;
					dataA+= dataA*rateA/100;
					dataB+= dataB*rateB/100;
					
					if(dataA>dataB) {
						
						System.out.print("In "+i+" year Population of town A >Population of town B");

						
				 }
				

			
				
	
					
					
				}
			
		
			
		}}

	

