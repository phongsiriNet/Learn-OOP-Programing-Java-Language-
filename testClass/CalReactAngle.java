package testClass;

public class CalReactAngle {

	public static void main(String[] args) {
		ReactAngle r1 = new ReactAngle();
		r1.setLength(5);
		r1.setWidth(2);
		System.out.println(r1.getLength());
		System.out.println(r1.getwidth());
		System.out.println("Perimeter is "+r1.perimeter());
		System.out.println("Area is "+r1.area());
		

	}

}
