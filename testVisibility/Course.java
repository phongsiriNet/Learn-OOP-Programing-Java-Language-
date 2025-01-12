package testVisibility;
import java.util.ArrayList;

public class Course {
	private String name;
	private int numOfCredit;
	ArrayList<Textbook> list;
	
	public Course(String n,int numCredit) {
		this.name = n;
		this.numOfCredit = numCredit;
	}
	public void addTextbook(ArrayList <Textbook> t) {
		this.list = t;
	}
	public ArrayList<Textbook> getTextbook(){
		return this.list;
	}
	public String toString() { 
		String  text = "";
		text += "Course name "+this.name+" Credit "+this.numOfCredit;
		return text;
	}

}
