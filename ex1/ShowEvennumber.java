package ex1;

public class ShowEvennumber {

	public static void main(String[] args) {
		int end=30,start=0;
		System.out.println("Show Even Number");
		System.out.println("===================");
		for(int i =1;i<=5;i++) {
			for(int j = 0; j<5;j++) {
					if (start<30) {
				start += 2 ;
				System.out.print(start + " ");
				}
			}
			System.out.println();
		}

	}

}
