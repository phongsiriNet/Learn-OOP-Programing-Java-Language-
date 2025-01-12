package ex1;

public class SumLessThan1000 {

	public static void main(String[] args) {
		int sum = 0;
		int i =1;
		boolean check =true;
		while(check) {
			if (sum+(i*i)>1000) {
				System.out.println("The sum minimun's less than 1000 is "+sum);
				System.out.print(sum+"+"+(i*i)+">1000");
				check = false;
			}
			sum = sum + (i * i);
			i++;
		}
	}

}
