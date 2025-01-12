package abtractTest;

public class Bear extends Creature{
	public Bear(String name ,int numberOfLegs) {
		super(name,numberOfLegs);
	}
	public boolean canWalkWithTwoLegs() {
		return true;
	}

}