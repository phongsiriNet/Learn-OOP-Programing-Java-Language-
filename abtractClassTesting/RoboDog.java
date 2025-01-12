package abtractTest;

public class RoboDog extends Dog implements Robot{

		boolean onoff,cal;
		private String name;
		  public RoboDog(String n,boolean oo,boolean ca) {
			  this.name =n;
			  this.onoff = oo;
			  this.cal = ca;
			  System.out.println("RoboDog's name is "+ this.name);
		  }
		 public void bark() {
			 System.out.println("RoboDog can bark");
		 }
		 public void run() {
			 System.out.println("RoboDog can run about 150 Km/hr.");
		 }
		 public void calculator() {
			 if(this.cal)
				 System.out.println("RoboDog can Calculate.");
			 else  
				 System.out.println("RoboDog cannot calculate");
		 }
		 public void statusOnOff() {
			 if(this.onoff)
				 System.out.println("RoboDog is available.");
			else 
		        System.out.println("RoboDog is unavailable.");
		 }

	}


