package Quiz;

public class Sum2D {

	public static void main(String[] args) {
		int [][] a = {{2,3,6},{4,5,20}};
		int [][] b = {{1,4,4},{2,3,6}};
		int [][] c = new int [a.length][a[0].length];
		  for (int i = 0; i < a.length ; i++) {
			  for (int j =0;j<a[0].length;j++) {
				  c[i][j] = a[i][j]+b[i][j];
		  }
		  }
		  System.out.println("a[] + b [] = c[]");
		  printArray(c);
		  
		  for (int i = 0; i < a.length ; i++) {
			  for (int j =0;j<a[0].length;j++) {
				  c[i][j] = a[i][j]-b[i][j];
		  }
		  }
		  System.out.println("a[] - b [] = c[]");
		  printArray(c);
	}
	public static void printArray(int[][] aa) {
		System.out.println("-------------------");
		   for (int i = 0; i < aa.length;i++) {
			   for(int j=0;j<aa[0].length;j++) {
			   System.out.print(aa[i][j]+" ");
		   }
			   System.out.println();
		  }
		  
		}

}
