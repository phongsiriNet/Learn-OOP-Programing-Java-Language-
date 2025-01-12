package Quiz;

public class CarArray {

	public static void main(String[] args) {
		boolean found =false;
		Car cars[] = new Car[4];
		cars[0] = new Car("Toyota", 56600);
		cars[1] = new Car("Honda", 63500);
		cars[2] = new Car("Tata", 87400);
		cars[3] = new Car("Hyundai", 63000);
		System.out.println("Car Information - " );  
		displayCar(cars);
		
		int sum =0;
		for(int i =0;i<cars.length;i++)
			sum += cars[i].getMiles();
		
		System.out.println("Total mile - " + sum);  
		System.out.println("Mile more than 60000 - " ); 
		findMile(cars,60000);
		
		found = findName(cars,"Yamaha");
		if(found)
			System.out.println("yamaha is in car list  " );
		else 
			System.out.println("yamaha is not found in car list  " );

	}
	  public static void displayCar(Car[] cars) {
		  for(int i = 0; i< cars.length; i++)
			  cars[i].printDetails();
	  }
	  
	  public static void findMile(Car[] cars, int m){
		  for(int i = 0; i< cars.length; i++)
			  if(cars[i].getMiles()>=m)
				  cars[i].printDetails();
				  
	  }
	  public static boolean findName(Car[] cars, String nn){

	        boolean found = false;

	        for(int i = 0; i< cars.length; i++){
	        	if (cars[i].getName().equals(nn))
	        	found = true;
	        }
	        return found;
}
}
