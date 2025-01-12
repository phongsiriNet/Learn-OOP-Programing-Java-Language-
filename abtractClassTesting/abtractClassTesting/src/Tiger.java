package abtractTest;

public class Tiger extends Creature{
	public Tiger(String name ,int numberOfLegs) {
		super(name,numberOfLegs);
	}
	public boolean canWalkWithTwoLegs() {
		return false;
	}

}
