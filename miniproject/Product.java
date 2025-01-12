package mini;

public class Product {

	private int productID;
	private String productName;
    private double productPrice;
    private int quantity;
 
 
    public Product(int id,String pN,double pp,int quantity) {
    	this.productID = id;
    	this.productName = pN;
    	this.productPrice = pp;
    	this.quantity = quantity;
    }
	    public void modifyProduct(int productId,String productName,double productPrice) {
	    	this.productID = productId;
	    	this.productName = productName;
	    	this.productPrice = productPrice;
	    }
	    public int getQuantity() {
	    	return this.quantity;
	    }
	    public void setQuantity(int quantity) {
	    	this.quantity = quantity;
	    }
	    public String toString() {
	    	return "Id: "+this.productID+" "+this.productName+" Quantity: "+this.quantity+" Price: "+this.productPrice+" Bath";
	    }
	    public double getPrice() {
	        return this.productPrice;
	    }
	    public String getName() {
	        return productName;
	    }
	    
}

