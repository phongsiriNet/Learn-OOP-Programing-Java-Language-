package InterfacePrac;

public class Boat implements ISteerable{
	public String position;
	public void turnLeft() {
		if(position.equalsIgnoreCase("south"))
			position = "East";
		else if(position.equalsIgnoreCase("East"))
			position = "North";
		else if(position.equalsIgnoreCase("North"))
			position = "West";
		else if(position.equalsIgnoreCase("West"))
			position = "South";
	}
	public void turnRigth() {
		if(position.equalsIgnoreCase("south"))
			position = "West";
		else if(position.equalsIgnoreCase("West"))
			position = "North";
		else if(position.equalsIgnoreCase("North"))
			position = "East";
		else if(position.equalsIgnoreCase("East"))
			position = "South";
	}
	public String getPosition() {
		return this.position;
	}

}
