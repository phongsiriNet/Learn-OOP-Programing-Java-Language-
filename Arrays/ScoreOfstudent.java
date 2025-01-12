package Arrays;

public class ScoreOfstudent {

	public static void main(String[] args) {
		int[][] store = {
			{1,19,18,17},
			{2,18,15,18},
			{3,17,16,18},
			{4,20,20,19}
		};
		for(int sub=1;sub<=3;sub++)
			System.out.print("\t\t subjet "+sub);
		for(int i =0;i<store.length;i++) {
			System.out.print("\nStudent No."+store[i][0]);
			for(int j =1;j<store[i].length;j++) {
			System.out.print(" "+store[i][j]);
			}
		}
	}

}
