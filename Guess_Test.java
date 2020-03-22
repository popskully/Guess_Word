package Test_Overview;

import java.util.*;

public class Guess_Test {
	public static void main(String args[]) {
		String secretPhrase = "People are stupid";
		String guesses = " "; //users guesses
		Scanner keyboard = new Scanner(System.in);
		boolean notDone = true;
		
		Scanner word = new Scanner(System.in);
		
		System.out.print("Enter a word: ");
		
		
		
		while(true) {
			//print out the board
			notDone = false;
			for(char secretLetter : secretPhrase.toCharArray()) { //iterates over the letters
				if(guesses.indexOf(secretLetter) == -1) { //not one of the guesses
					System.out.print('*');
					notDone = true;
				} else {
					System.out.print(secretLetter);
				}
			}
			if(!notDone) {
				break;
			}
			//get users guess
			System.out.print("\nEnter your letter:");
			String letter = keyboard.next();
			guesses += letter;
		}
		System.out.println("Congrats");
	}
}
