package testVisibility;

public class Textbook {
	private String title;
	private String author;
	
	public Textbook(String t,String a) {
		this.title = t;
		this.author = a;
	}
	public String toString() { 
		String  text = "";
		text += this.title +" "+ this.author;
		return text;
	}

}
