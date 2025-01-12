package mini;

import java.util.ArrayList;

public class Order {
	private Customer customer;
	private double total;
	 private ArrayList <Product> products = new ArrayList<Product>();
	 public Order(ArrayList <Product> products,Customer customer) {
		 this.products = products;
		 this.customer = customer;
		 this.total = 0; 
	 }
	
	 public void calculateTotal(int [] amout) {
	  
	        for (int i=0;i<products.size();i++) 
	        	total += products.get(i).getPrice() * amout[i]; 
	        
	        
	    }
	 public void displayOrderDetails(int [] amout) {
	        System.out.println("Order Details:");
	        System.out.println("Customer: " + customer.getName());
	        System.out.println("Products:");

	        for (int i=0;i<products.size();i++)  {
	        	
	            System.out.println("- " + products.get(i).getName() + " Price: " + products.get(i).getPrice()+" Quantity: "+amout[i]);
	        }

	        System.out.println("Total: " + total);
	    }
	  public String toString() {
	    	return "Total : "+this.total;
	    }
	}

