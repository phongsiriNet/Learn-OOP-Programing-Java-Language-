package abtractTest;

public abstract class Creature {
	 private String name = null;
	  private int numberOfLegs = 0;
	  public Creature(String name, int numberOfLegs) {

		   this.name = name;
		   this.numberOfLegs = numberOfLegs;
}
	  public abstract boolean canWalkWithTwoLegs();
	  public void printName() {

		  System.out.println("Name is: " + name);

		 }
}