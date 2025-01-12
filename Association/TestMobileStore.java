package Association;
import java.util.ArrayList;
public class TestMobileStore {
	public static void main(String [] agrs) {
		ArrayList <Mobile> mm = new ArrayList<Mobile>();
		mm.add(new Mobile("Realme","8GB","128GB"));
		mm.add(new Mobile("SAMSUNG A21S","4GB","128GB"));
		mm.add(new Mobile("SAMSUNG M10","4GB","64GB"));		
		MobileStore mob = new MobileStore(mm);
		
		for(int i=0;i<mob.getTotalMobile().size();i++) {
			System.out.println("Name: "+mob.getTotalMobile().get(i).getName()+" RAM: "+mob.getTotalMobile().get(i).getRam()+" ROM: "+mob.getTotalMobile().get(i).getRom());
		}
	}

}
