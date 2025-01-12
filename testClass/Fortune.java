package testClass;

public class Fortune {
	int num;
	Fortune () {}
	
	public  void setFortune(int n){
		this.num=n;
	}
	public void random() {
		switch (num) {
		case 1 : System.out.println("You will fet 4.0");
				break;
		case 2 : System.out.println("Happiness is programming");
				break;
		case 3 : System.out.println("Satisfaction follows hard work");
				break;
		case 4 : System.out.println("Patience is virtue");
				break;
		case 5 : System.out.println("fail");
		break;
		case 6 : System.out.println("got B");
		break;
		case 7 : System.out.println("got C");
		break;
		case 8 : System.out.println("got D");
		break;
		case 9 : System.out.println("got F");
		break;
		case 10 : System.out.println("got 49.9");
		break;
		}
	}
	

}
