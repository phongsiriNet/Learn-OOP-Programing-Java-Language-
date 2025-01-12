package abtractTest;

public class Test {
	public static void main(String [] args) {
		Male m1 = new Male("netjub");
		Female f1 = new Female(" jubnet");
		
		m1.setAge(25);
		f1.setAge(18);
		m1.display();
		f1.display();
	}

}
