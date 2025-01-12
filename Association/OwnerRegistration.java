package Association;
import java.util.Scanner;
public class OwnerRegistration {

	public static void main(String[] args) {
		Bicycle b1 = new Bicycle();
		Account a1 = new Account();
		
		b1.setOwnerName("Johnqt");
		a1.setOwnerName("Johnqt");
        a1.setInitailBalance(250);
        a1.add(25);
        a1.deduct(50);
        
        System.out.println(b1.getOwnerName());
        System.out.println(a1.getOwnerName());
        System.out.println(a1.getCurrentBalance());
	}

}
