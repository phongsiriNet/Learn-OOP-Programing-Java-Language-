package testClass;

public class AnimalTest {

	public static void main(String[] args) {
		Animal cat = new Animal(false,"black",4);
		System.out.println("Cat is Vegetarian? " +cat.isVegetarian());
		System.out.println("Cat has " +cat.getNoOfLegs()+"legs.");
		System.out.println("Cat color is  " +cat.getcolor());
		
		Animal bird = new Animal(false,"white",2);
		System.out.println("Bird is Vegetarian? " +bird.isVegetarian());
		System.out.println("Bird has " +bird.getNoOfLegs()+"legs.");
		System.out.println("Bird color is  " +bird.getcolor());

	}

}
