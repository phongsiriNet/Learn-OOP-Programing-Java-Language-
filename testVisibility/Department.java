package testVisibility;
import java.util.ArrayList;
public class Department {
	private String name;
	private ArrayList<Course> c = new ArrayList<Course> ();
	
	public Department(String n) {
		this.name = n;
	}
	public void addCourse(Course c) {
		this.c.add(c);
	}
	public ArrayList<Course> getCourse(){
		return this.c;
	}
	public String toString() { 
		String  text = "";
		text += "Department "+this.name+" have "+this.c.size()+" courses";
		return text;
	}

}
