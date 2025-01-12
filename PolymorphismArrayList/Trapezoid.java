package quizPolymorphismArrayList;

public class Trapezoid {
	protected double w1,w2;
	protected Point a,b;
	Point o1 = new Point();
	public Trapezoid() {}
	public Trapezoid(double w1,double w2,Point a,Point b) {
		this.w1 = w1;
		this.w2 = w2;
		this.a = a;
		this.b = b;
	}
	public void setWidth(double w1,double w2) {
		this.w1 = w1;
		this.w2 = w2;
	}
	public void setPoint(Point a,Point b) {
		this.a = a;
		this.b = b;
	}public double findArea() {
		return 1/2*w1+w2*o1.distance();
	}
	

}
