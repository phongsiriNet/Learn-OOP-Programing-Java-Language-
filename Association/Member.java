package Association;

public class Member {
	private String name;
	private int age;
	private String ID;
	private final Card card;

	public Member(String n,int  a,String id,Card c) {
		name =n;
		age =a;
		ID = id;
		card = c;
	}
	public Card getCard() {
		return card;
	}
	public String getId() {
		return ID;
	}
	public  String toString() {
		return " ID: "+this.ID+" Name: "+this.name+" Age: "+this.age;
	}
	
}