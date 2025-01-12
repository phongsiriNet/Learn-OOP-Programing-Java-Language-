package testClass;
import java.util.Date;
public class CollegeStudent {
	private String fname,lname;
	private Date enrollment,projectedGraduation;
	
	public CollegeStudent() {}
	public CollegeStudent(String  fname,String lname,Date enrollment,Date projectedGraduation) {
		this.fname = fname;
		this.lname = lname;
		this.enrollment = enrollment;
		this.projectedGraduation= projectedGraduation;
	}
	public void setFirstName(String fname) {
		this.fname = fname;
	}
	public String getFirstName() {
		return fname;
	}
	public void setLastName(String lname) {
		this.lname = lname;
	}
	public String getLastName() {
		return lname;
	}
	public void setEnrollmentDate(Date enrollment ) {
		this.enrollment = enrollment;
	}
	public Date getEnrollmentDate() {
		return enrollment;
	}
	public void setprojectedGraduation(Date projectedGraduation ) {
		this.projectedGraduation = projectedGraduation;
	}
	public Date getprojectedGraduation() {
		return projectedGraduation;
	}
}

