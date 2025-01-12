package inherite;

public class SoccerPlayer {
	String name;
	int number;
	
	public SoccerPlayer() {}
	public SoccerPlayer(String name,int number) {
		this.name=name;
		this.number=number;
	}
	public  void setName(String name) {
		this.name = name;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public  String getName() {
		return name;
	}
	public String toString() {
		return name+" "+number;
	}

}
