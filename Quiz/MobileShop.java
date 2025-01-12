package Quiz;
import java.util.ArrayList;
public class MobileShop {

	public static void main(String[] args) {
		Mobile mob1 = new Mobile("Realme6","8GB","128GB");
		Mobile mob2 = new Mobile("SAMSUNG A21S", "4GB", "128");  
		Mobile mob3 = new Mobile("SAMSUNG M10", "4GB", "64GB");  
		ArrayList <Mobile> mobiles = new ArrayList<Mobile>();
		mobiles.add(mob1);
		mobiles.add(mob2);
		mobiles.add(mob3);
		
		MobileStore store = new MobileStore(mobiles);
		/*ArrayList<Mobile> mob = store.getTotalMobileInStore();
		for(Mobile mb:mob) {
			System.out.println("Name: "+mb.getName()+" RAM :"+mb.getRam()+" ROM :"+mb.getRom());
		}*/
		for(int i=0;i<store.getTotalMobileInStore().size();i++) {
			System.out.println("Name: "+store.getTotalMobileInStore().get(i).getName()+" RAM :"+store.getTotalMobileInStore().get(i).getRam()+" ROM :"+store.getTotalMobileInStore().get(i).getRom());
		}
	}

}
