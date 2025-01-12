package Arrays;

import java.util.Scanner;
public class RunTimeDimension{
  public static void main(String[] args){
	  String s1; 
	  int i,numgrades;
	  Scanner input = new Scanner (System.in);
	  System.out.println("Enter a number");
	  numgrades = input.nextInt();

	  //allocate the array
	  int[] score = new int[numgrades]; 

	  System.out.println("The values are initialized to");

	  for(i = 0;i < numgrades; i++)  // print all elements
		System.out.println("score[ "+ i + " ] is " + score[i]);	  			  
   }
}
