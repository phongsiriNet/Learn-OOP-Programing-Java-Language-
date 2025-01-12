package Quiz;
import java.util.Scanner;
public class Array {

	public static void main(String[] args) {
	Scanner input = new Scanner (System.in);
	int n = input.nextInt();
	int [] a = new int[n];
	for(int i=0;i<n;i++) {
		a[i] = input.nextInt();
	}
		System.out.println("a[]");
		printArray(a);
		
		double max = a[0];
		double sum = a[0];
	for(int i =1;i<a.length;i++) {
		sum +=a[i];
		if (max<a[i])
			max = a[i];
	}

	System.out.println("max = " + max);
	System.out.println("acerage = " +(sum/a.length));
	int[] b = new int[a.length];
	for (int i=0;i<a.length;i++) {
		b[i] = a[i];
	}
	System.out.println();

    System.out.println("b[]");
    printArray(b);
	}
	public static void printArray(int[] aa) {
	System.out.println("-------------------");
	   for (int i = 0; i < aa.length;i++) {
		   System.out.print(aa[i]+" ");
	   }
	   System.out.println();
	}

}
