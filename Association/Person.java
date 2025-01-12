package Association;

public class Person {
	protected int age;
	protected char gender;
	protected String name;
	protected String phone;
	
	public Person(int a,char g,String n,String p) {
		age =a;
		gender = g;
		name = n;
		phone = p;
	}
	public int getAge() {
		return age;
	}
	public char getGender() {
		return gender;
	}
	public String getName() {
		return name;
	}
	public String toString() {
		String s = "";
		s +="Name: "+ this.name +" Gender: "+this.gender+" Age: "+this.age+" Phone: "+this.phone;
		return s;
	}
}
