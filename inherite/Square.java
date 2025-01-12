package inherite;

public class Square {
	protected double width;
	
	public Square() {}
	public Square(double width) {
		this.width = width;
	}
	public void setWidth() {
		this.width = width;
	}
	public double getWidth() {
		return width;
	}
	public double getArea() {
		return width*4;
	}
}
