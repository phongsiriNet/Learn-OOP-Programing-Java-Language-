package Arrays;

public class Ex1 {

	public static void main(String[] args) {
		int [] arrays = {0,1,2,3,4,5,6,7,8,9};
		 findmax(arrays);
		 findmin(arrays);
		 countless9(arrays);
	}
	public static void findmax(int [] data) {
		int max=data[0],pos=0;
		for(int i =0;i<data.length;i++) {
			if (data[i]>max) {
				max =  data[i];
				pos = i;
			}
		}
		System.out.println("Max = "+max + " at position "+pos);
	}
	public static void findmin(int [] data) {
		int min=data[0],pos=0;
		for(int i =0;i<data.length;i++) {
			if (data[i]<min) {
				min =  data[i];
				pos = i;
			}
		}
		System.out.println("Max = "+min + " at position "+pos);
	}
	
	public static void countless9(int [] data) {
		int countm=0,countl=0;
		for(int i =0;i<data.length;i++) {
			if (data[i]>=9) 
				countm++;
			
			
			if (data[i]<9) 
				countl++;
				
			
		}
		System.out.println(countl+"Number less than9 ");
		System.out.println(countm+"Number more than9 ");
	}

}
