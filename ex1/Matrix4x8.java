package ex1;

public class Matrix4x8 {

	public static void main(String[] args) {
		int end =32,start=1;
		for(int i =1;i<=4;i++) {
			for (int j =1;j<=8;j++) {
				if (start>end) 
					break;
				
				System.out.print(start+" ");
				start++;
				
			}
			System.out.println(" ");
		}

	}

}
