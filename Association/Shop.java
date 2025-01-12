package Association;
import java.util.ArrayList;
public class Shop {
	private String name;
	private ArrayList<Member> s;
	
	public Shop(String n,ArrayList<Member> s) {
		this.name = n;
		this.s = s;
	}
	public String getName() {
		return name;
	}
	public ArrayList<Member> getMember(){
		return s;
	}
	/*public boolean deleteMember(Member s) {
		for(in i=0;)
	}*/
	public String toString() {
		return "Shop "+this.name+" : "+s.size()+" Members";
	}

}