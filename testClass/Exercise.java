package testClass;

public class Exercise {

	public static void main(String[] args) {
		Employee[] emp = new Employee [3];
        String[] name = {"Joe", "Jane", "John"};
        String[] jTitle = {"Manager", "Engineer", "Programmer"};
        for (int i =0; i< emp.length; i++){         
               emp[i] = new Employee( name[i], jTitle[i]);
        }  
		display(emp);       
    }
	public static void display(Employee[] e) {
      for (int i = 0; i < e.length; i++)
         System.out.println(e[i].name + " "  + e[i]. jobTitle);  
  }
}
