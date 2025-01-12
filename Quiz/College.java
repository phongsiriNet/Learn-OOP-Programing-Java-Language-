package Quiz;
import java.util.ArrayList;
public class College {
	String collegeName;
	private ArrayList<Course> courses;
	College(String collegeName,ArrayList<Course> courses){
		this.collegeName = collegeName;
		this.courses = courses;
	}
	public int countStudent() {
		int studentsInCollege=0;
		ArrayList<Student> students;
		for(Course course:this.courses) {
			students = course.studentData();
			for(Student s:students) {
				studentsInCollege++;
			}
		}
		return studentsInCollege;
	}

}
