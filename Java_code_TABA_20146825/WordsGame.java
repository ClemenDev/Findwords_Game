
public class WordsGame{

	private int numberRounds;

	//constructors
	public WordsGame(){}

	public WordsGame(int numberRounds){
		this.numberRounds = numberRounds;
	}

	//setters
	public void setNumberRounds(int numberRounds) {
		this.numberRounds = numberRounds;
	}

	//getters
	public int getNumberRounds(){
		return numberRounds;
	}

	//method to set/display number of rounds to play
	public int displayNumberRounds(){
	return numberRounds;
	}

}