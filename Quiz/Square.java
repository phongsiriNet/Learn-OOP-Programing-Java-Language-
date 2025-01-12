package Quiz;

public class Square {
	private double side;
	public Square() {
		side=1;
	}
	public double getSide() {
		   return this.side;
 }
	public void setSide(double value) {
		side = value;
	}
	public double calculatePerimeter() {
		return side*4;
	}
	  public double calculateArea() {
	        return side * side;
	    }
}
