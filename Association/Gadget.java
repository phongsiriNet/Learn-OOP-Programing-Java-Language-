package Association;

public class Gadget {
	private String name;
	private String brand;
	private int price;
	private int memory;
	
	public Gadget(String name,String brand,int price,int memory) {
		this.name = name;
		this.brand = brand;
		this.price = price;
		this.memory = memory;
	}
	public String getBrand() {
		return this.brand;
	}
	public String getName() {
		return this.name;
	}
	public int getPrice() {
		return this.price;
	}
	public int getMemory() {
		return this.memory;
	}
	public String toString() {
		String data ="";
		data +=name+", Brand "+this.brand+", "+this.price+" Bath"+", Memory "+this.memory+" GB";
		return data;
	}

}