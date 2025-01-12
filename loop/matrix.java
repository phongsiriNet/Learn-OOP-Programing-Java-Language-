package loop;

public class matrix {

	public static void main(String[] args) {
		int start = 1,end=32;
		for(int i = 1;i<=4;i++) {
			for (int j =1;j<=8;j++) {
				 if(start>end) 
					 break;
				 
				 
					 System.out.print(start+"  ");
					 start++;
				 
			
			}
			System.out.println(" ");
		}
		
	}

}
