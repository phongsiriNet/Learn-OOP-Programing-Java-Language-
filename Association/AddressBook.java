package Association;
import java.util.ArrayList;
public class AddressBook {
	protected ArrayList<Person> entry;
	protected int size;
public AddressBook() {}
public AddressBook(int size) {
	this.size=size;
	 entry = new ArrayList<Person>(size);	
}
public void add(Person newPerson) {
	if(entry.size()<size)
	entry.add(newPerson);
	else System.out.println("AddressBook is full");
}
public void update(Person newPerson) {
	for(int i =0;i<entry.size();i++) {
		
		if(entry.get(i).name.equals(newPerson.getName())) {
			entry.remove(i);
			entry.add(i,newPerson);
		}
	}
}
public Person searchName(String name) {
	Person n = null;
	for(int i =0;i<entry.size();i++) {
		if(entry.get(i).getName().equals(name)) 
			n = entry.get(i);
	}
	return n;
	
}
public Person searchPhone(String phone) {
	Person n = null;
	for(Person fp:entry) {
		if(fp.phone.equals(phone)) 
			n = fp;
	}
	return n;
}
public void delete(Person deleteperson) {
	for(int i=0;i<entry.size();i++) {
		if(entry.get(i).equals(deleteperson))
			entry.remove(i);
	}
}
public ArrayList<Person> getPerson(){
	return entry;
}
}
