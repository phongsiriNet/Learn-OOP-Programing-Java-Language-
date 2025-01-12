package abtractTest;
public class Male extends Child{
	Male(){};
	Male(String name){
		super(name,"Male");
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void display() {
		System.out.println("Name: "+this.name+" Gender: "+this.gender+" Age: "+this.age);
	}

}
