package testClass;

public class Converter {
	String tocurrency,fromcurency = "USD";
	double amount,rate;
	public  Converter(){
		
	}
	public  Converter(String fc,String tc,double amount) {
		this.fromcurency = fc;
		this.tocurrency = tc;
		this.amount = amount;
	}
	public void setRate(String tc ,double rate){
		this.rate = rate;
		this.tocurrency = tc; 
	}
	public String toString(){
		return "From "+fromcurency+" to "+tocurrency;
		
	}
	public double getResult() {
		return amount*rate;
	}
}

