package testClass;

public class Animal {
	private boolean vegetarian;
	private String color;
	private int noOfLegs;
	public Animal() { }
	public Animal (boolean veg,String color,int legs) {
		this.vegetarian = veg;
		this.noOfLegs = legs;
		this.color = color;
	}
	public boolean isVegetarian() {
		return vegetarian;
	}
	public int getNoOfLegs() {
		return noOfLegs;
	}
	public void setNoOflegs(int noOfLegs) {
		this.noOfLegs = noOfLegs;
	}
	public String getcolor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}

}
