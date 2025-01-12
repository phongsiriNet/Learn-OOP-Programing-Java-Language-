package loop;

public class NestedLoop {

	public static void main(String[] args) {
		final int NUM_OF_LINES =8 ;  
			for (int row = 1; row <= NUM_OF_LINES; row++) {     
				for (int column = 1; column <= NUM_OF_LINES - row; column++)        
				   	System.out.print(" "); 
						for (int num =row; num<=row+1;num++)
							System.out.print(num);  
						
							
						
							
							System.out.println(" "); 
							
							
				
				
				
				
				
	}					

}}
