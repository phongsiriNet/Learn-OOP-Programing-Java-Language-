package abtractTest;

public class Donkey extends Creature{
	public Donkey(String name ,int numberOfLegs) {
		super(name,numberOfLegs);
	}
	public boolean canWalkWithTwoLegs() {
		return false;
	}

}


