package quizPolymorphismArrayList;

public class Point {
	private int x,y;
	public Point() {
		
	}
	
	public Point(int x,int y) {
		this.x =x;
		this.y = y;
	}
	public int getPointX() {
		return x;
	}
	public int getPointY() {
		return y;
	}
	public double distance() {
		return Math.sqrt(x*x+y*y);
	}

}
