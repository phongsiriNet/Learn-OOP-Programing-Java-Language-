package testClass;

public class Line {
	private int xstart=0; 
	private int ystart=0;
	private int xend = 0;
	private int yend=0;

	Line() {} 
	 Line(int ys, int xs,int ye,int xe) {
	this.ystart = ys; 
	this.xstart = xs;
	this.yend = ye;
	this.xend = xe;
	 }
	public double getLength() {
		double length = Math.sqrt(Math.pow(Math.abs(yend-ystart),2)+Math.pow(Math.abs(xend-xstart), 2));
		return length ;
	}
	public double getSlope() {
		return (double)(yend - ystart)/(xend-xstart);
	}
	public void translate(int tx,int ty) {
		this.yend = yend+ty;
		this.xend = xend+tx;
	}
	public String toString() {
		return "The length is "+this.getLength()+"The slope is "+this.getSlope() 
;	}
	

}
