package testClass;

public class ReactAngle {
	double length,width;
	public ReactAngle() {}
	public void  setLength(double length) {
		this.length = length;
	}
	public void  setWidth(double width) {
		this.width = width;
	}
	public double  getLength() {
		return length;
	}
	public double  getwidth() {
		return this.width;
	}
	public double perimeter() {
		return 2*(this.length+this.width);
	}
	public double area() {
		return this.length*this.width;
	}
}
