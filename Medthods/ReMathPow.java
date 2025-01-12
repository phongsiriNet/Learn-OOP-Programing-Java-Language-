package Medthods;
import java.util.Scanner;
public class ReMathPow {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	int pow;
	double base,result=0;
	System.out.print("Enter a base number:  ");
	base = input.nextDouble();
	System.out.print("Enter a power number:  ");
	pow = input.nextInt();
	if (pow <0) {
		pow = pow * -1 ;
		result = 1.0/(power(base,pow));
	}else result = power(base,pow);
	System.out.print(base+" power "+pow+" = "+result);

	}
	public static double power(double base,int pow){
	
	if (pow==0) 
		return 1;
	else 
		return base * power( base, pow-1);
		
	
}}
