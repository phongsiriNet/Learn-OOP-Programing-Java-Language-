package testClass;

public class SmsDemoArray {

	public static void main(String[] args) {
		Sms [] s1 = new Sms[3];
		 int [] freq;
		String data[] = {"488051","494999","494051"};
		

		 System.out.println("We have "+s1.length+" Sms Numbers");
		 for(int i=0;i<s1.length;i++) {
			 s1[i] = new Sms(data[i]);
			 System.out.println((i+1)+". "+s1[i].toString());
			 s1[i].readAs();
			 freq = calFreq(data[i]);
			printDigit(freq);
			
		 }
		  
	}
	public static int [] calFreq(String  data) {
		char [] ch = {'0','1','2','3','4','5','6','7','8','9'};
		int freq [] = new int[ch.length];
		
			for(int j=0;j<data.length();j++) {
				char c = data.charAt(j);
				for(int k =0;k<ch.length;k++) 
					if(c==ch[k]) freq[k] ++; ;
	}
		return freq;

}
	public static void printDigit(int [] freq ) {
		System.out.println();
		System.out.print("Digit Numbers \n");
		for(int i =0;i<freq.length;i++) {
			if(freq[i]>0)  {
				System.out.print(i+" ");
				for(int j=0;j<freq[i];j++)
				System.out.print("*");
			
				System.out.println(" ");
			}
			
		}
		
	}
}