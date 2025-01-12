package InterfacePrac;

public class TestISteerable {

	public static void main(String[] args) {
		Boat b1 = new Boat();
		Truck t1 = new Truck();
		
		b1.position = "South";
		t1.position = "North";
		
		System.out.println("Boat current positon " +b1.getPosition());
		for(int i=0;i<10;i++)
			b1.turnRigth();
		System.out.println("After turn rigth 10 times, now Positions is " +t1.getPosition());
		System.out.println("Truck current positon " +b1.getPosition());
		for(int i=0;i<5;i++)
			t1.turnLeft();
		System.out.println("After turn left 5 times, now Positions is " +t1.getPosition());

	}

}
