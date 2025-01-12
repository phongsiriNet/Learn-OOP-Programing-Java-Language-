package mini;
import java.util.ArrayList;
public class Stock {
	
    private Product product;
    private ArrayList <Product> list = new ArrayList<>();
    public Stock (ArrayList<Product> list) {
    	this.list = list;
    }
    
    public String sheckQuantity(int[] quan) {
    	ArrayList <Product> p = this.getProduct();
    	String message = "";
    	boolean out = true;
    	for(int i=0;i<p.size();i++) {
    		int remaining = p.get(i).getQuantity() - quan[i];
    		if(remaining<=0) {
    			out = false;
    			break;
    		}else p.get(i).setQuantity(remaining);
    	}
    	if(out== true) 
    		message +="Order sucuessful";
    	else if (out== false)
    		message +="Your order was unsuccessful. Please show all products to check how many products are left. ";
    	
    	return message;
    }
    public ArrayList <Product> getProduct(){
    	return list;
    }
  
}