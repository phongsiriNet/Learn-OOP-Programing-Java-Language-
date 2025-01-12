package Medthods;
import java.util.Scanner;
public class LongestString {

	public static void main(String[] args) {
		String longest=" ";
		int max= Integer.MIN_VALUE;
		   Scanner input = new Scanner(System.in);
	
		   System.out.print("Enter no of lines : ");
		   int line = input.nextInt();
		   input.nextLine();
		   for(int i =1;i<=line;i++) {
			   System.out.print("Enter Message : ");
			   String text= input.nextLine();
			   int textlong = getTextLong(text);
			   	if(textlong>max) {
			   	max=textlong;	
			   	longest = text;
			   	}
		
}
		   System.out.print("The longest string is  : "+longest);
		   
	
	
	}
	public static int getTextLong(String text) {
		
		return text.length(); 
		
		
	}
	
}
	
		   
		   
			