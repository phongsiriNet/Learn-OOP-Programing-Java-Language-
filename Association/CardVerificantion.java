package Association;

import java.util.ArrayList;
import java.util.Scanner;
public class CardVerificantion {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		Card c1A = new Card("5648","1234");
		Card c2A = new Card("5649","1234");
		Card c3A = new Card("5651","1234");
		Card c1On = new Card("5650","1234");
		Card c2On = new Card("5652","1234");
		
		Member m1A = new Member("AAA",20,"65100100",c1A);
		Member m2A = new Member("BBB",22,"65100200",c2A);
		Member m3A = new Member("DDD",21,"65100400",c3A);
		
		Member m1On = new Member("CCC",21,"65100300",c1On);
		Member m2On = new Member("EEE",21,"65100500",c2On);
		
		ArrayList <Member> a = new ArrayList<Member>() ;
		a.add(m1A);
		a.add(m2A);
		a.add(m3A);
		
		ArrayList <Member> o = new ArrayList<Member>() ;
		o.add(m1On);
		o.add(m2On);
		
		Shop adidas = new Shop("Adidas",a);
		Shop on = new Shop("On",o);
		
		displayMember(adidas);
		displayMember(on);
		System.out.println("Welcome to Change Pin Menu");
		boolean isValid = false;
		boolean isValidPin = false;
		boolean isValidNewpin = true;
		Card targetCard;
		String check = " ";
		String id =""; 
		
do {
	System.out.println("=================================");
	System.out.print("Enter member id :");
			id =sc.next();
			do {
				if(validId(adidas,on,id)) {
					System.out.println("Valid member id");
					isValid = true;
				}else {
					System.out.println("Invalid member id");
					System.out.print("Try again: ");
					id =sc.next();
					
				}
				
			}while(isValid == false);
			
			System.out.print("Please enter card no: ");
			String cNo = sc.next();
			System.out.print("Please enter pin no: ");
			String pin = sc.next();
			do {
				if(validPin(adidas,on,cNo,pin)) {
					ArrayList<Member> adi = adidas.getMember();
					ArrayList<Member> oni = on.getMember();
					isValidPin = true;
				for(int i=0;i<adi.size();i++) {
					if(adi.get(i).getId().equals(id)) 
						System.out.println("This card belongs to Shop "+adidas.getName()+adi.get(i).toString());
						
					
				}
				for(int i=0;i<oni.size();i++) {
					if(oni.get(i).getId().equals(id))
						System.out.println("This card belongs to Shop "+on.getName()+oni.get(i).toString());
						
				}
				
				}else {
					System.out.println("Invalid cardnumber or pin");
					System.out.print("Try again \n");
					System.out.print("Please enter card no: ");
					cNo = sc.next();
					System.out.print("Please enter pin no: ");
					pin = sc.next();
				}
				
			}while(isValidPin == false);
			
			do {
			System.out.print("Enter new pin: " );
			String newPin = sc.next();
			if(pin.equals(newPin)) {
				System.out.println("Invalid new pin" );
				isValidNewpin = false;
			}else {
				targetCard = targetCard(adidas,on,cNo,pin);
				targetCard.setPin(newPin);
				System.out.println("Update complete");
				System.out.println(targetCard);
				isValidNewpin = true;
			}
			
			}while(!isValidNewpin);
			

			System.out.println(" " );
			System.out.print("Continue [y/n] : " );
			check = sc.next();
		}while(check.equalsIgnoreCase("y"));
	
	
		System.out.println("Welcome to Search Menu");
		do{
			System.out.println("=================================");
			System.out.print("Enter member id :");
			id =sc.next();
			if(validId(adidas,on,id)) {
				System.out.println("Valid member id");
				System.out.print("Please enter card no: ");
				String cNo = sc.next();
				System.out.print("Please enter pin no: ");
				String pin = sc.next();
				if(validPin(adidas,on,cNo,pin)) {
					ArrayList<Member> adi = adidas.getMember();
					ArrayList<Member> oni = on.getMember();
				for(int i=0;i<adi.size();i++) {
					if(adi.get(i).getId().equals(id)) {
						System.out.println("This card belongs to Shop "+adidas.getName()+adi.get(i).toString());
						System.out.println("=================================");
					}
				}
				for(int i=0;i<oni.size();i++) {
					if(oni.get(i).getId().equals(id))
					System.out.println("This card belongs to Shop "+on.getName()+oni.get(i).toString());
					System.out.println("=================================");
				}
			}else {System.out.println("Invalid card");
				System.out.println("=================================");
			}
			}else System.out.println("Invalid member id");
			
			System.out.println(" " );
			System.out.print("Continue [y/n] : " );
			check = sc.next();
			
		}while(check.equalsIgnoreCase("Y"));
		
		System.out.println("Welcome to Delete Menu");
		do{
			System.out.print("Enter member id :");
			id =sc.next();
			if(validId(adidas,on,id)) {
				ArrayList <Member> adi = adidas.getMember();
				ArrayList <Member> oni = on.getMember();
				for(int i=0;i<adi.size();i++) {
					if(adi.get(i).getId().equals(id)) {
						adi.remove(i);
					System.out.println("Delete complete");
					}
					;
				}
				for(int i=0;i<oni.size();i++) {
					if(oni.get(i).getId().equals(id)) {
						oni.remove(i);
					System.out.println("Delete complete");
					}
					
				}
				displayMember(adidas);
				displayMember(on);
				
			}else System.out.println("Invalid member ID");
			
			System.out.println(" " );
			System.out.print("Continue [y/n] : " );
			check = sc.next();
			
		}while(check.equalsIgnoreCase("Y"));
		
		
		
	}

	
	

	public static void displayMember(Shop n) {
		ArrayList<Member> m = n.getMember();
		System.out.println(n.toString());
		for(int i=0;i<m.size();i++) {
			Card c = m.get(i).getCard();
			System.out.println((i+1)+ ". "+m.get(i).toString()+"\n"+c.toString());
			
		}
		
	}
	public static boolean validId(Shop a,Shop o,String c) {
		boolean check = false;
		ArrayList<Member> adi = a.getMember();
		ArrayList<Member> on = o.getMember();
		for(int i =0;i<adi.size();i++) {
			if(adi.get(i).getId().equals(c))
				check= true;
		}
		for(int i =0;i<on.size();i++) {
			if(on.get(i).getId().equals(c))
				check= true;
		}
		return check;
		}
	public static  boolean   validPin(Shop a,Shop b, String card,String pin) {
		ArrayList<Member> adi = a.getMember();
		ArrayList<Member> on = b.getMember();
		boolean check = false;
		for(int i =0;i<adi.size();i++) {
			Card c = adi.get(i).getCard();
			if(c.isValid(card, pin))
				check= true;
		}
		for(int i =0;i<on.size();i++) {
			Card c = on.get(i).getCard();
			if(c.isValid(card, pin))
				check= true;
		}
		return check;
		}
	public static  Card   targetCard(Shop a,Shop b, String card,String pin) {
		ArrayList<Member> adi = a.getMember();
		ArrayList<Member> on = b.getMember();
		Card targetCard = null;
		for(int i =0;i<adi.size();i++) {
			Card c = adi.get(i).getCard();
			if(c.isValid(card, pin))
				targetCard = c;
		}
		for(int i =0;i<on.size();i++) {
			Card c = on.get(i).getCard();
			if(c.isValid(card, pin))
				targetCard = c;
		}
		return targetCard;
		}
	
	}