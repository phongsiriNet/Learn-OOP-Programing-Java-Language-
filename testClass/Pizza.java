package testClass;

public class Pizza {
	String top;
	int diameter;
	double price;
	Pizza(){}
	Pizza(String top,int dismeter){
		this.top=top;
		this.diameter = dismeter;
		if(diameter >12)
			price = 13.99;
		else price = 10;
	}
	public void setToppings(String top) {
		this.top = top;
	}
	public void setDiameter(int diameter) {
		this.diameter = diameter;
	}
	public int getDiameter() {
		return diameter;
	}
	public String getToppings() {
		return top;
	}
	public double calPrice() {
		if(diameter >12)
			price = 13.99;
		else price = 10;
		return price;
	}public double getPrice() {
		return price;
	}
	
	public String toString() {
		return "Pizza size is "+this.getDiameter()+" inches topping "+this.getToppings()+" price "+this.calPrice();
	}

}
