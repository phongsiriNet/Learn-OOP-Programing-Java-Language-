package quizPolymorphismArrayList;

public class Book {
	private int id;  
	private String name,author,publisher;  
	private int quantity; 
	
	public Book(int id,String name,String author,String publisher,int quantity) {
		this.id=id; 
		this.name   = name;  
	    this.author = author;
	    this.publisher=publisher;
	    this.quantity=quantity;
	}
	public int getQuantity() {
		return this.quantity;
	}
	public int getId() {
		return this.id;
	}
	public String getPublisher(){
		return this.publisher;
	}
	public String toString() {
		 return id+", "+ name+", "+ author+", "+ publisher+", "+quantity;
	}

}
