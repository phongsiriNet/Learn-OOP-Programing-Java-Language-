package testVisibility;
import java.util.Scanner;
import java.util.ArrayList;
public class DepartmentTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [] targetBook1 = null;
		int [] targetBook2 = null;
		int [] targetBook3 = null;
		String [] nameBook = {"Java","COA","OS","Network","OOP"};
		String [] nameAuthor = {"AAA","BBB","CCC","DDD","EEE"};
		ArrayList<Textbook>listBook = new ArrayList<Textbook> ();
		
		for(int i=0;i<nameBook.length;i++) 
			listBook.add(new Textbook(nameBook[i],nameAuthor[i]));
			
		Course c1 = new Course("SWE62-205",3);
		Course c2 = new Course("SWE62-211",4);
		Course c3 = new Course("SWE62-212",3);
		c1.addTextbook(listBook); 
		c2.addTextbook(listBook);
		c3.addTextbook(listBook);
		
		Department swe = new Department("SWE");
		swe.addCourse(c1);
		swe.addCourse(c2);
		swe.addCourse(c3);
		
		System.out.println(swe.toString());
		ArrayList<Course> c = swe.getCourse();
		for(int i =0;i<c.size();i++) 
			System.out.println((i+1)+". "+c.get(i).toString());
		
		
		System.out.println("List of Textbook");
		ArrayList<Textbook> list = c.get(0).getTextbook();
		for(int i =0;i<list.size();i++) 
			System.out.println((i+1)+". "+list.get(i).toString());
		
		int i=0;
		while(i<c.size()) {
			System.out.println("No."+(i+1)+" "+c.get(i).toString());
			System.out.print("Pls enter number of textbook : ");
			int numbook = sc.nextInt();
			if(i==0) {
				targetBook1 = new int [numbook];
				System.out.print("Pls enter  textbook book number : ");
				for(int j=0;j<numbook;j++) 
					targetBook1[j] = sc.nextInt();
				
			}else if(i==1) {
				targetBook2 = new int [numbook];
				System.out.print("Pls enter  textbook book number : ");
				for(int j=0;j<numbook;j++) 
					targetBook2[j] = sc.nextInt();
			}else {
				targetBook3 = new int [numbook];
				System.out.print("Pls enter  textbook book number : ");
				for(int j=0;j<numbook;j++) 
					targetBook3[j] = sc.nextInt();
			}
			
			i++;
			
		}
		System.out.println("Display all information");
		System.out.println(swe.toString());
		displayData(targetBook1,c.get(0));
		displayData(targetBook2,c.get(1));
		displayData(targetBook3,c.get(2));
		
		
	}
	public static void displayData(int [] target,Course c) {
		ArrayList<Textbook> list = c.getTextbook();
		System.out.println("=== Textbook List ===");
		for(int i=0;i<target.length;i++) {
			for(int j=0;j<list.size();j++){
				if(target[i]-1 == j) 
					System.out.println((i+1)+". "+list.get(j).toString());
			}
			
		}
		System.out.println("=====================");
	}

}
