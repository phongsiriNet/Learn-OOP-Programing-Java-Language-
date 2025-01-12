package Association;
import java.util.ArrayList;
public class MobileStore {
	private final ArrayList <Mobile> mobiles;
	
	public MobileStore(ArrayList <Mobile> mobiles) {
		this.mobiles= mobiles;
	}
	public ArrayList <Mobile> getTotalMobile(){
		return mobiles;
	}

}
