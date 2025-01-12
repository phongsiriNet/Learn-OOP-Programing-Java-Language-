package testClass;
import java.util.Date;
import java.util.Scanner;
public class TestCollegeStudent {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		CollegeStudent [] o1 = new CollegeStudent[2];
		String [] fname = new String[2];
		String [] lname = new String[2];
		int [] day = new int[2];
		int [] mon = new int[2];
		int [] year = new int[2];
		Date [] enroll = new Date[2];
	
		for(int i = 0;i<o1.length;i++) {
			System.out.print("Enter your name :");
			fname[i] = sc.next();
			lname[i] = sc.next();
			System.out.print("Enter enrollment date :");
			day[i] = sc.nextInt();
			mon[i] = sc.nextInt();
			year[i] = sc.nextInt();
			
		}
		
		for(int i =0;i<o1.length;i++) 
			enroll[i] = createDate(day[i], mon[i], year[i]);
		
		
		
		
		for(int i =0;i<o1.length;i++) {
			o1[i] = new CollegeStudent(fname[i],lname[i],enroll[i],null);
			 Date projectedGraduationDate = new Date();
		        projectedGraduationDate.setYear(enroll[i].getYear() + 4);
		        o1[i].setprojectedGraduation(projectedGraduationDate);
		}
		
		
		
		System.out.println("Data Feild " );
		System.out.println("===========================================================================" );
		for(int i =0;i<o1.length;i++) {
			 System.out.println("First Name: " + o1[i].getFirstName());
		        System.out.println("Last Name: " + o1[i].getLastName());
		        System.out.println("Enrollment Date: " + o1[i].getEnrollmentDate());
		        System.out.println("Projected Graduation Date: " + o1[i].getprojectedGraduation());
		}

		
		
	   
	        
	}
   private static Date createDate(int day, int month, int year) {
        // Note: Month in Date is 0-based, so subtract 1 from the user input
        month--; 

        // Create a Date object with the specified day, month, and year
        return new Date(year - 1900, month, day);
    }
}


