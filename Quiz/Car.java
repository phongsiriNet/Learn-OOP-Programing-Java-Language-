package Quiz;

public class Car {
	private String name;
	private int miles;
	public Car(String name,int miles) {
		this.name = name;
		this.miles = miles;
		
	}
	public String getName() {
		return this.name;
	}
	public int getMiles() {
		return this.miles;
	}
	public void printDetails() {
		System.out.println(name+" - "+miles);
	}

}
