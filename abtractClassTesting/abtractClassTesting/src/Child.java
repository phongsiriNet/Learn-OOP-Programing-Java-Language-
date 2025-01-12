package abtractTest;

public abstract class Child {
	protected String name;
	protected String gender;
	protected int age;
	Child (){};
	Child (String name,String gender){
		this.name = name;
		this.gender = gender;
	}
	public abstract void setAge(int a);
	public abstract void display();
}
