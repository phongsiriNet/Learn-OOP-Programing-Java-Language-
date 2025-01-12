package Association;

public class Card {
	private String cardNo;
	private String pin;
	
	public Card(String No,String pin) {
		this.cardNo = No;
		this.pin = pin;
	}
	public boolean isValid(String no,String pin) {
		boolean check = false;
		if(cardNo.equals(no) && this.pin.equals(pin)) 
				check = true;
		return check;
	}
	public void setPin(String pin) {
		this.pin = pin;
	}
	public String toString() {
		String message ="";
		message +="Card No. "+cardNo+" and pin is "+pin;
		return message;
	}

}