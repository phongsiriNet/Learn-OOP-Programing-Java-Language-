package mini;
import java.util.ArrayList;
import java.util.Scanner;
public class Shop {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList <Product> listOfProduct = new ArrayList<>();
		int shirt = 0,shoe = 0,sock = 0,dress =0,jean =0,glove =0;
		
		Product p1 = new Product(01,"Shirt",1500,10);
		Product p2 = new Product(02,"Shoe",2000,15);
		Product p3 = new Product(03,"Sock",200,20);
		Product p4 = new Product(04,"Dress",5000,20);
		Product p5 = new Product(05,"Jean",2000,18);
		Product p6 = new Product(06,"Glove",1000,22);
		
		listOfProduct.add(p1);
		listOfProduct.add(p2);
		listOfProduct.add(p3);
		listOfProduct.add(p4);
		listOfProduct.add(p5);
		listOfProduct.add(p6);
		 
		
		Stock data = new Stock(listOfProduct);
		
		 boolean continueC = true;
         System.out.println("Welcome to Shop Shop");
         System.out.print("Enter your name: ");
         String name = scanner.nextLine();
         System.out.print("Enter your phone ");
         String phone = scanner.nextLine();
         System.out.print("Enter your address ");
         String address = scanner.nextLine();
         Customer c1 = new Customer (name,address,phone);
         Order o1 = new Order (listOfProduct,c1);
          

     while (continueC) {
         
    	 System.out.println("-------------------Menu-----------------------\n==============================================");
         System.out.println("1.Display all Product");
         System.out.println("2.Show your information");
         System.out.println("3.Edit your information");
         System.out.println("4.Shopping");
         System.out.println("5.Show your order");
         System.out.println("6.Exit");
         System.out.print("Choose a menu: ");

         int choice = scanner.nextInt();

         switch (choice) {
             case 1: DisplayAllProduct(data);
             		System.out.print("Do you want to chose again(y/n): ");
             		char c = scanner.next().charAt(0);
             		if(c=='Y'||c=='y'){
             			continueC = true;
             		}else if(c=='N'||c=='n'){
             		continueC = false;
             		}
             		break;
             case 2:System.out.println( c1.toString());
             		System.out.print("Do you want to chose again(y/n): ");
             		c = scanner.next().charAt(0);
             		if(c=='Y'||c=='y'){
             			continueC = true;
             		}else if(c=='N'||c=='n'){
             		continueC = false;
             		}
             		break;
             case 3:
            	 	scanner.nextLine();
            	 	System.out.print("Enter your name: ");
            	 	name = scanner.nextLine();
            	 	System.out.print("Enter your phone ");
            	 	phone = scanner.nextLine();
            	 	System.out.print("Enter your address ");
            	 	address = scanner.nextLine();
            	 	c1.editInformation(name, address, phone);
            	 	System.out.println( c1.toString());
            	 	System.out.print("Do you want to chose again(y/n): ");
            	 	c = scanner.next().charAt(0);
            	 	if(c=='Y'||c=='y'){
            	 		continueC = true;
                 		}else if(c=='N'||c=='n'){
                 			continueC = false;
                 		}
            	 		break;
             case 4:
            	 System.out.print("How many product you want to buy for shirt : ");
            	  shirt = scanner.nextInt();
            	 System.out.print("How many product you want to buy for shoe : ");
            	 shoe = scanner.nextInt();
            	 System.out.print("How many product you want to buy for sock : ");
            	 sock = scanner.nextInt();
            	 System.out.print("How many product you want to buy for dress : ");
            	 dress = scanner.nextInt();
            	 System.out.print("How many product you want to buy for jean : ");
            	  jean = scanner.nextInt();
            	 System.out.print("How many product you want to buy for glove: ");
            	 glove = scanner.nextInt();
            	 int [] list = {shirt,shoe,sock,dress,jean,glove};
            	 System.out.println(data.sheckQuantity(list));
            	 o1.calculateTotal(list);
            	 System.out.println(o1.toString());
            	 
            	 
            	 System.out.print("Do you want to chose again(y/n): ");
         	 	c = scanner.next().charAt(0);
         	 	if(c=='Y'||c=='y'){
         	 		continueC = true;
              		}else if(c=='N'||c=='n'){
              			continueC = false;
              		}
         	 		break;
             case 5: 
            	 	int [] amount = {shirt,shoe,sock,dress,jean,glove};
            	 	o1.calculateTotal(amount);
            	    o1.displayOrderDetails(amount);
         	 	System.out.print("Do you want to chose again(y/n): ");
         	 	c = scanner.next().charAt(0);
         	 	if(c=='Y'||c=='y'){
         	 		continueC = true;
              		}else if(c=='N'||c=='n'){
              			continueC = false;
              		}
         	 		break;
             case 6:
                 continueC = false;
                 break;
             default:
                 System.out.println("Please choose again.");
                 break;
         }
     }
     System.out.println("Exiting the Shop Shop. Goodbye!");
	}
	public static void DisplayAllProduct(Stock s) {
		ArrayList <Product> p = s.getProduct();
		for(int i =0;i<p.size();i++)
			System.out.println(p.get(i).toString());
		
	}

		
	}

