package quizPolymorphismArrayList;
import java.util.ArrayList;
public class ArraylistBook {

	public static void main(String[] args) {
		ArrayList<Book>list = new ArrayList<Book>();
		Book b1 =  new Book(101,"Let us C","Yashwant Kanetkar","Wiley",8);  
		Book b2 = new Book(102,"Data Communications and Networking","Forouzan","Mc Graw Hill",4);  
		Book b3 = new Book(103,"Operating System","Galvin","Wiley",6);  
		list.add(b1);
		list.add(b2);
		list.add(b3);
		ArrayList a = new ArrayList();
		a.add(4);
		a.add(0, 5);
		a.add("Hello\n");
		for(int i =0;i<a.size();i++) {
			System.out.print( " " +a.get(i) ); 
		}
		
		for(int i =0;i<list.size();i++) {
			 System.out.println( (i+1) + " " +list.get(i).toString());
		}
		 int sum = 0;
		 for(int i =0;i<list.size();i++) {
			 sum +=list.get(i).getQuantity();
		 }
		 System.out.println( "Quality Summary " + sum); 
		 
		  System.out.println( "Find book id 101 =>"  ); 
		  if(find(list,101))
			  System.out.println( "book id 101 is in book list"  ); 

		    else

		      System.out.println( "book id 101 is not in book list"  ); 
		  
		    System.out.println( "Find book from Wiley =>"  ); 
		findName(list,"William");
		    
	}
	public static boolean find(ArrayList<Book>b,int id) {
		boolean found = false;
		for(int i =0;i<b.size();i++) {
			if((b.get(i).getId())==id)
				found =true;
		}
		return found;
	}
	public static void findName(ArrayList<Book>b,String name) {
		int j=1;
		boolean check = false;
	    for(int i =0;i<b.size();i++) {
	    	if(b.get(i).getPublisher().equals(name)) {
	    		System.out.println( (j++) + " " +b.get(i).toString());
	    		check = true;
	    	}
	}
	    if(!check) System.out.println("Not found");
	}
}
