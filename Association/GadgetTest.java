package Association;

import java.util.Scanner;
import java.util.ArrayList;
public class GadgetTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String check = " ";
		int select,price;
		String find;
		ArrayList<Gadget> list = new ArrayList<Gadget>();
		list.add(new Gadget("Smartphone","Huawei",20000,64 ));
		list.add(new Gadget("Notebook","Apple",40000,256 ));
		list.add(new Gadget("Tablet","Samsung",30000,128 ));
		list.add(new Gadget("Smartphone","Apple",40000,256 ));
		list.add(new Gadget("Tablet","Apple",35000,128 ));
		
		Person1 o1 = new Person1("AAA",16,"389000055645",list);
		System.out.println(o1.toString());
		displayData(o1);
		System.out.println("Select search by" );
		System.out.println("1: Name" );
		System.out.println("2: Brand" );
		System.out.println("3: Price" );
	
		do {
			
			System.out.print("Select:" );
			select = sc.nextInt();
			sc.nextLine();
			switch(select) {
			case 1 : System.out.print("Enter name :" );
					find = sc.nextLine();
					searchByName(find,o1.getAllGadget(),o1);
					break;
			case 2 : System.out.print("Enter brand :" );
					find = sc.nextLine();
						searchByBrand(find, o1.getAllGadget(),o1);
					break;
			case 3 : System.out.print("Enter price :" );
					price = sc.nextInt();
					searchByPrice(price, o1.getAllGadget(),o1);
					break;
			}
			System.out.println(" " );
			System.out.print("Continue [y/n] : " );
			check = sc.next();
		}while(check.equalsIgnoreCase("y"));
		System.out.println("Select delete by" );
		System.out.println("1: Name" );
		System.out.println("2: Brand" );
		System.out.println("3: Price" );
do {
			
			System.out.print("Select:" );
			select = sc.nextInt();
			sc.nextLine();
			switch(select) {
			case 1 : System.out.print("Enter name :" );
					find = sc.nextLine();
					deleteByName(find,o1.getAllGadget(),o1);
					break;
			case 2 : System.out.print("Enter brand :" );
					find = sc.nextLine();
						deleteByBrand(find, o1.getAllGadget(),o1);
					break;
			case 3 : System.out.print("Enter price :" );
					price = sc.nextInt();
					deleteByPrice(price, o1.getAllGadget(),o1);
					break;
			}
			System.out.println(" " );
			System.out.print("Continue [y/n] : " );
			check = sc.next();
		}while(check.equalsIgnoreCase("y"));

	
	}
	public static void searchByName(String name,ArrayList<Gadget> list,Person1 o) {
		int stack = 0;
		for(int i=0;i<list.size();i++) {
			if(list.get(i).getName().equalsIgnoreCase(name))
				stack ++;
		}
		if(stack>0) {
			System.out.print(o.getName()+" "+"has "+stack+" gadgets: ");
		for(int i=0;i<list.size();i++) {
			if(list.get(i).getName().equalsIgnoreCase(name))
				System.out.print(list.get(i).getBrand()+" ");
		}
		}
		else System.out.print(o.getName()+" does not has "+name);
		
		
	}
	public static void searchByBrand(String brand,ArrayList<Gadget> list,Person1 o) {
		int stack = 0;
		for(int i=0;i<list.size();i++) {
			if(list.get(i).getBrand().equalsIgnoreCase(brand))
				stack ++;
		}
		if(stack>0) {
			System.out.print(o.getName()+" "+"has "+stack+" gadgets: ");
			for(int i=0;i<list.size();i++) {
				if(list.get(i).getBrand().equalsIgnoreCase(brand))
					System.out.print(list.get(i).getName()+" ");
			}
			}
		else System.out.print(o.getName()+" does not have"+ brand);
	}
	public static void searchByPrice(int price,ArrayList<Gadget> list,Person1 o) {
		int stack = 0;
		for(int i=0;i<list.size();i++) {
			if(list.get(i).getPrice() == price)
				stack ++;
		}
	
		if(stack>0) {
			System.out.print(o.getName()+" "+"has "+stack+" gadgets: ");
			for(int i=0;i<list.size();i++) {
				if(list.get(i).getPrice() == price)
					System.out.print(list.get(i).getName()+" ");
			}
			}
		else System.out.print(o.getName()+" does not has gadget at this price");
	}
	
public static void deleteByName(String deleteName,ArrayList<Gadget> list,Person1 o1) {
	boolean isMatch = false;
	for(int i =0;i<list.size();i++) {
	if(list.get(i).getName().equalsIgnoreCase(deleteName))
		isMatch = true;
	}
	if(isMatch) {
	for(int i =0;i<list.size();i++) {
		if(list.get(i).getName().equalsIgnoreCase(deleteName)) {
			list.remove(i);
		}
	}
	displayData(o1);
	}
		else 
			System.out.println("can not deleted");
	
	
}
public static void deleteByBrand(String deleteBrand,ArrayList<Gadget> list,Person1 o1) {
	boolean isMatch = false;
	for(int i =0;i<list.size();i++) {
	if(list.get(i).getBrand().equalsIgnoreCase(deleteBrand))
		isMatch = true;
	}
	if(isMatch) {
	for(int i =0;i<list.size();i++) {
		if(list.get(i).getBrand().equalsIgnoreCase(deleteBrand)) {
			list.remove(i);
		}
	}
	displayData(o1);
	}
		else 
			System.out.println("can not deleted");
	
}
	public static void deleteByPrice(int targetPrice,ArrayList<Gadget> list,Person1 o1) {
		boolean isMatch = false;
		for(int i =0;i<list.size();i++) {
		if(list.get(i).getPrice() == targetPrice)
			isMatch = true;
			
			
		}
		if(isMatch) {
		for(int i =0;i<list.size();i++) {
			if(list.get(i).getPrice() == targetPrice) {
				list.remove(i);
			}
		}
		displayData(o1);
		}
			else 
				System.out.println("can not deleted");
		
}

public static void displayData(Person1 o1) {	
	int totalPrice = 0 ,sumMemory =0;
	ArrayList <Gadget> newList = o1.getAllGadget();
	for(int i =0;i<newList.size();i++) {
		System.out.println((i+1)+". "+newList.get(i).toString());
		totalPrice = totalPrice + newList.get(i).getPrice();
		sumMemory = sumMemory + newList.get(i).getMemory();
	}
	System.out.println("====================================================");
	System.out.println("Total Price: "+totalPrice+ " Bath, Total Memory: "+sumMemory +" GB");
	
	
	
}
	

}