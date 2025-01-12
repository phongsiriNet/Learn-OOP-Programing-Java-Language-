package Quiz;

public class TestString {
	public static void main(String[] args) {
		int [] list =  {0,1,2,3,4,5,6,7,8,9};
		String result = createPhoneNumber(list);
		 System.out.println(result); // Output: "(123) 456-7890"
		 double d = list[5]/2;
		 System.out.println(d);
	}
	public static String createPhoneNumber(int[] numbers) {
		if (numbers.length >10)
			return "array length should be 10";
		
		String phoneNumber = String.format("(%d%d%d) %d%d%d-%d%d%d%d",
                numbers[0], numbers[1], numbers[2],
                numbers[3], numbers[4], numbers[5],
                numbers[6], numbers[7], numbers[8], numbers[9]);

        return phoneNumber;
	}

}
