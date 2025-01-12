package ex1;
public class RecieveChar {

	public static void main(String[] args) {
		for (int i =65;i<=69;i++ ) {
			for (int j =65;j<=i;j++ ) {
				char ch = (char) j;
				System.out.print( ch + " " );
			}
			System.out.println();
		}
		
	}

}
