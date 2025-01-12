package Quiz;
import java.util.ArrayList;
public class Course {
	String name;
	private ArrayList<Student> students;
	Course(String name,ArrayList<Student>students){
		this.name = name;
		this.students=students;
	}
	public ArrayList<Student> studentData(){
		return this.students;
	}
}
