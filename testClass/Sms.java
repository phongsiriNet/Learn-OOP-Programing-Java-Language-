package testClass;

public class Sms {
	private String number;
	private char [] check = {'0','1','2','3','4','5','6','7','8','9'};
	private String [] as = {"Zero","One","Two","Three","Four","Five","Six","Seven","Eigth","Nine"};
	
	
	public Sms() {}
	
	public Sms(String number) {
		this.number = number;
	}
	public void readAs() {
		System.out.print("Read as : ");
		for(int i =0;i<number.length();i++) {
			char c = number.charAt(i);
			for(int j =0;j<check.length;j++) {
			if(c==check[j]) System.out.print(as[j]+" ");
			}
		}
	}
	public String toString() {
		return "Sms Number :"+number;
	}

}
