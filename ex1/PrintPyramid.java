package ex1;

public class PrintPyramid {

	public static void main(String[] args) {
		final int NUM_OF_LINES =5 ;        
		   for (int row = 1; row <= NUM_OF_LINES; row++) {       
			   for (int column = 1; column <= NUM_OF_LINES - row; column++)        
				   	System.out.print(" ");     // Print leading spaces     
			   		for (int num = row; num >= 1; num--)     // Print leading numbers   
			   			System.out.print(num);          
			   				for (int num = 2; num <= row; num++)         
			   					System.out.print(num);     // Print ending numbers 
			 
			   				System.out.println(); // Start a new line     
		  }  
		   
		 }
	
		}