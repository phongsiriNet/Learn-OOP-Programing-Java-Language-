package inherite;

public class SWESoccer {

	public static void main(String[] args) {
	int i;
	String [] namefor = {"AAA","BBB"};
	String [] namemid = {"CCC","DDD","EEE","FFF"};
	String [] namedef = {"GGG","HHH","III","JJJ"};
	String [] namegoal = {"KKK"};
	String [] namere = {"LLL","MMM"};
	int [] fo = {1,2,};
	int [] de = {3,4,5,6};
	int [] mi = {7,8,9,10};
	int [] re = {11,12};
	int [] go = {13};
	
	SoccerPlayer [] mm  = {new Forward("fff",2),new Defense ("ddd",10)};
	
	for( i=0;i<mm.length;i++) {
		if(mm[i] instanceof Forward)
			System.out.println(((Forward)mm[i]).toString());
	else if (mm[i] instanceof Defense)
		System.out.println(mm[i].toString());
	}
	/*Forward [] f = new Forward[2];
	Defense [] d = new Defense[4];
	Midfeild [] m = new Midfeild[4];
	Goalkeeper [] g = new Goalkeeper[1];
	Reserve [] r = new Reserve[2]; 
	
	System.out.println("SWE Soccer Team");
	System.out.println("List of player:");
	System.out.println("Forward:");
	for(i=0;i<f.length;i++) {
		f[i] = new Forward(namefor[i],fo[i]);
		System.out.println("\t"+(i+1)+"."+f[i].toString());
	}
	System.out.println("Defense:");
	for(i=0;i<d.length;i++) {
		d[i] = new Defense(namedef[i],de[i]);
		System.out.println("\t"+(i+1)+"."+d[i].toString());
	}
	System.out.println("Midfeild:");
	for(i=0;i<m.length;i++) {
		m[i] = new Midfeild(namedef[i],mi[i]);
		System.out.println("\t"+(i+1)+"."+m[i].toString());
	}
	System.out.println("Goalkeeper:");
	System.out.println("Can use hands");
	for(i=0;i<g.length;i++) {
		g[i] = new Goalkeeper(namegoal[i],go[i]);
		System.out.println("\t"+(i+1)+"."+g[i].toString());
	}
	System.out.println("Reserve:");
	System.out.println("Not playing");
	for(i=0;i<r.length;i++) {
		r[i] = new Reserve(namere[i],re[i]);
		System.out.println("\t"+(i+1)+"."+r[i].toString());
	}*/
	
	

	}

}
