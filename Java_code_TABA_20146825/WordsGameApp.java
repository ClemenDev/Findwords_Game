import java.util.Scanner;

public class WordsGameApp{

	public static void main (String [] args){

		System.out.println("Welcome to the 'Find Computer Words Game'");
		System.out.println();
		System.out.println("Before you start the game, here are the scoring rules: ");
		System.out.println("For words of LESS than 7 characters: you receive the same amount of points as the number of characters in the word.");
		System.out.println("For words of AT LEAST 7 characters: you receive the double amount of points.");
		System.out.println("Here is an example for each scenario: the word 'bit' = 3 points / the word 'digital' = 14 points");
		System.out.println();

		//local variables rounds
		int numberRounds;

		//create and initialize a Scanner object
		Scanner input = new Scanner (System.in);
		System.out.println("How many rounds you would like to play?");
		numberRounds = input.nextInt();

		WordsGame myGame = new WordsGame(numberRounds);
        myGame.displayNumberRounds();

		//local variables alphabet
		String alphLetters = ("abcdefghijklmnopqrstuvwxyz");
		String randomLetters= " ";
		int amountLetters = 12;

		//create and initialize Player objects
		Player player1 = new Player("Player 1");
		Player player2 = new Player("Player 2");

		//create and initialize ValidWord object
		ValidWord valid = new ValidWord();

		//loop to initialize/set rounds
		for (int i=0; i<numberRounds; i++) {
			System.out.println("=============================");
			System.out.println("Round " + (i + 1));

		//create and initialize an Alphabet object
		Alphabet myAlphabet = new Alphabet(randomLetters, alphLetters, amountLetters);

		String letterRandom = myAlphabet.displayRandomLetters();

	 	//play game
		System.out.println("Player "+ player1.getName() + " is your turn:");
	    System.out.println("Here are your letters: " + letterRandom);
	    String wordPlayer =  input.next();

	    boolean isCorrect1 = valid.validateWordGiven(wordPlayer);
	    if(isCorrect1) {
	    player1.countPoint(wordPlayer);
	    }

	    //generate new random letters for next round
	    letterRandom = myAlphabet.displayRandomLetters();
	    System.out.println("Player " + player2.getName() + " is your turn:");
	    System.out.println("Here are your letters: " + letterRandom);
	    wordPlayer =  input.next();

	    boolean isCorrect2 = valid.validateWordGiven(wordPlayer);
	        if(isCorrect2) {
	        	player2.countPoint(wordPlayer);
	        }
		}

		//end of game
		System.out.println();
		System.out.println("End of the game");
		System.out.println(player1.getInfoPlayer());
		System.out.println(player2.getInfoPlayer());
		System.out.println();

		//loop to set the winner
		if(player1.getPoint() > player2.getPoint()) {
			System.out.println("The winner is: " + player1.getName());
		} else if(player1.getPoint() < player2.getPoint()) {
			System.out.println("The winner is: " + player2.getName());
		} else {
			System.out.println("You guys got a draw!");
		}

   	}
}

