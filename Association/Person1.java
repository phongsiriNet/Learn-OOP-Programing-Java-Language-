package Association;

import java.util.ArrayList;
public class Person1 {
	private String name;
	private int age;
	private String id;
	ArrayList<Gadget> list = new ArrayList<Gadget>();
	
	public Person1(String n, int a,String id,ArrayList<Gadget> list) {
		name = n;
		age =a;
		this.id =id;
		this.list = list; 
	}
	public String getName() {
		return name;
	}
	public ArrayList<Gadget> getAllGadget(){
		return list;
	}
	public String toString() {
		return "Name: "+this.name+" Age "+age + " ID "+this.id+" has "+list.size()+" Gadgets"; 
	}
	

}

