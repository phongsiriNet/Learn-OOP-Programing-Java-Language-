package Arrays;

public class HaveSameData {

	public static void main(String[] args) {
		int [] a = {0,0,0,0,4,1,0};
		int [] b = {1,2,3,4,5,6,7};
		check (a,b);
		

	}
	public static void check(int [] a,int[]b) {
		int count=0;
		System.out.print("Same data:");
		for(int i =0;i<a.length;i++) {
			for(int j =0; j<b.length;j++) {
			if (a[i]==b[j]) {
				count++;
				System.out.print(a[i]);
				if(i<a.length-1) System.out.print(",");
			}
			}
		}
		System.out.print("\nHave "+count+ " Number");
	}

}
