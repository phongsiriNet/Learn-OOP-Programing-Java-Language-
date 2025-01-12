package quizPolymorphismArrayList;

public class TestAnimal { 
	public static void main(String args[]){
		Animal a = new Animal();
		Animal b = new Dog();
		Animal c = new Bird();
		
		displayAnimal(a);
		((Dog)b).bark();
		displayAnimal(b);
		displayAnimal(c);
		((Bird)c).sing();
		
}
	public static void displayAnimal(Animal animal) {
		if(animal instanceof Animal)
			animal.move();
		else if(animal instanceof Dog)
			((Dog)animal).move();
		else
			((Bird)animal).move();
	}
	

}
