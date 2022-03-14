
public class Player{

	private String name;
	private int point = 0;

	public Player(String name) {
		this.name = name;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPoint() {
		return point;
	}

	public void setPoint(int point) {
		this.point = point;
	}
	//method to get info about players
	public String getInfoPlayer() {
		return name + " ,your total points are: " + point;
	}

	//mehtod to count points
	public void countPoint(String letter) {
		if(letter.length()>=7) {
			point = point + letter.length()*2;
		} else {
			point = point + letter.length();
		}
	}
}