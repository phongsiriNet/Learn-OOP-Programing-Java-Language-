package abtractTest;

public class Female extends Child{
	Female(){};
	Female(String name){
		super(name,"Female");
	}
	public void setAge(int a) {
		age = a;
	}
	public void display() {
		System.out.println("Name: "+name+" Gender: "+gender+" Age: "+age);
	}

}
