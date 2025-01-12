package Quiz;
import java.util.ArrayList;
public class CollegeTest {

	public static void main(String[] args) {
	Student std1 = new Student("Emma", 1801, "MCA");  
	Student std2 = new Student("Adele", 1802, "BSC-CS");  
	Student std3 = new Student("Aria", 1803, "Poly"); 
	Student std4 = new Student ("Ally", 1804, "MCA");
	Student std5 = new Student("Paul", 1805, "Poly"); 
	
	ArrayList <Student> mca_students = new ArrayList<Student>();
	 mca_students.add (std1);  
	 mca_students.add (std4); 
	 ArrayList<Student> bsc_cs_students = new ArrayList<Student>();   
     bsc_cs_students.add(std2);
     ArrayList<Student> poly_students = new ArrayList<Student>();   
     poly_students.add(std3);   
     poly_students.add(std5); 
     Course MCA = new Course("MCA", mca_students);   
     Course BSC_CS = new Course("BSC-CS", bsc_cs_students);  
     Course Poly = new Course("Poly", poly_students);   
     ArrayList <Course> courses = new ArrayList<Course>();   

     courses.add(MCA);   

     courses.add (BSC_CS);  

     courses.add(Poly);
     College college = new College("ABES", courses);             

     System.out.print("Total number of students in the college "+college.collegeName+" is "+college.countStudent());
	 

	}

}
