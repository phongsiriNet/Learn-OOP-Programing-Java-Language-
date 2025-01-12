package Association;
import java.util.ArrayList;
import java.util.Scanner;
public class TestAddressBook {

	public static void main(String[] args) {
		AddressBook mylist = new AddressBook(5);
		Person o1 =new Person(18,'M',"Rahul","000000");
		Person o2 = new Person(20,'F',"Alexia","111111");
		mylist.add(o1);
		mylist.add(o2);
		mylist.add(new Person(17,'M',"Johny","2222222"));
		mylist.add(new Person(40,'M',"Alabi","3333333"));
		mylist.add(new Person(55,'F',"Jammpy","4444444"));
		mylist.add(new Person(22,'F',"Monty","55555555"));
		
	
		
		ArrayList <Person> o = mylist.getPerson();
		for(int i=0;i<o.size();i++) 
			System.out.println(o.get(i).toString());
			
		
		mylist.delete(o1);
		System.out.println("After delete\n======================================");
		
		for(int i=0;i<o.size();i++) { 
			System.out.println(o.get(i).toString());
		}
		
		Person o6 = new Person(20,'F',"Alexia","77777777");
		mylist.update(o6);
		System.out.println("After update\n======================================");
		for(int i=0;i<o.size();i++) 
			System.out.println(o.get(i).toString());
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Search by name:");
		String name = sc.nextLine();
		Person findName = mylist.searchName(name);
		if(findName !=null) System.out.print(findName.toString());
		else System.out.println("Not found");
		
		
		System.out.print("\nSearch by Phone:");
		String phone = sc.nextLine();
		Person findPhone = mylist.searchPhone(phone);
		if(findPhone !=null) System.out.print(findPhone.toString());
		else System.out.println("Not found");
	}

}
