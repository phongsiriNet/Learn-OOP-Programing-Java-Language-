package mini;
import java.util.ArrayList;
public class Customer {
	

	 private String name;
	 private String address;
	 private String phone;
	 	public Customer() {}
	 	  public Customer(String name) {
	 	        this.name = name;
	 	    }

	 	 
	 	public Customer(String name,String address,String p) {
	 		this.name = name;
	 		this.address = address;
	 		this.phone = p;
	 		
	 	}
	    public String getName() {
 	        return name;
 	    }
	 	public void editInformation(String name,String address,String phone) {
	 		this.name = name;
	 		this.address = address;
	 		this.phone = phone;
	 	}
	 	 public String toString() {
		    	return "Name: "+this.name+" Phone: "+this.phone+" Address: "+this.address;
		    }
	 	
}
