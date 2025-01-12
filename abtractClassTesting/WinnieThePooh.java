package abtractTest;

public class WinnieThePooh {
	public static void main(String[] args) {
		Tiger tiger = new Tiger("Tiger",4);
		 tiger.printName();
		 System.out.println(tiger.canWalkWithTwoLegs());
		 Bear bear = new Bear("The Pooh",4);
		 bear.printName();
		 System.out.println(bear.canWalkWithTwoLegs());
		   Pig pig = new Pig("Piglet", 4);
		   pig.printName();
		   System.out.println(pig.canWalkWithTwoLegs());
		   Donkey donkey = new Donkey("Igor", 4);
		   donkey.printName();

		     System.out.println(donkey.canWalkWithTwoLegs());

}
}