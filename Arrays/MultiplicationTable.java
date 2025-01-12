package Arrays;

public class MultiplicationTable {

	public static void main(String[] args) {
		int [][] mul = new int[11][12];
		int start=2,k=1;
		for(int i =0;i<mul.length;i++) {
			for(int j=0;j<mul[i].length;j++) {
				mul[i][j] = start*k;
				k++;
				
			}
			start++;
			k=1;
		}
		for(int i =0;i<mul.length;i++) {
			for(int j=0;j<mul[i].length;j++) {
				System.out.print(mul[i][j]+" ");
				
			}
			System.out.println("");
			
		}

	}

}
