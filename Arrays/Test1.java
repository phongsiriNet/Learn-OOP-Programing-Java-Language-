package Arrays;
import java.util.Arrays;
public class Test1 {
	public static void main(String [] agrs) {
		int [] a = {1,2,3,4,5,6};
		int [] b ;
		
		
		for(int value:a)
		System.out.println(value);

	}
	public static int[] reverse(int [] list) {
		int [] re = new int[list.length];
	
		for (int i =0,j = re.length-1;i<list.length;i++,j--) {
			re[i] = list[j];
		}
		return re;
	}


}
