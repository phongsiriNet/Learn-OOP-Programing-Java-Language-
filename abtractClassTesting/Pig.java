package abtractTest;

public class Pig extends Creature{
	public Pig(String name ,int numberOfLegs) {
		super(name,numberOfLegs);
	}
	public boolean canWalkWithTwoLegs() {
		return false;
	}

}


