import java.util.Random;

public class Alphabet{

	//variables
	private String alphLetters = ("abcdefghijklmnopqrstuvwxyz");
	private String randomLetters = "";
	private int amountLetters = 12;

	//constructor
	public Alphabet(){}

	public Alphabet(String randomLetters, String alphLetters, int amountLetters){
		this.randomLetters = randomLetters;
		this.alphLetters = alphLetters;
		this.amountLetters = amountLetters;
	}

	//method to display random letters
	public String displayRandomLetters(){

		Random rand = new Random();

				char[] randLet = new char [amountLetters];

				for(int i = 0; i < amountLetters; i++){
				randLet[i] = alphLetters.charAt(rand.nextInt(26));
				}

				for(int i = 0; i < randLet.length; i++){
				randomLetters += randLet[i];
				}

		return randomLetters;
	}
}