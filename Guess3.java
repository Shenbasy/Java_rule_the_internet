//

class Guess3{ public static void main(String args[]) throws java.io.IOException {
	
	char ch, answer = 's';
	
	System.out.println("\nGuess the letter from range is A-Z."); 
	System.out.print("Try guess it: ");
		
	ch = (char) System.in.read(); // Получить символ с клавиатуры
	
	if(ch == answer) {
			
		System.out.println("** Right!** \nCongratulation, you guessed, letter is: " + answer);
		
	}
	else {
			
		if(ch>answer) System.out.println("\nSorry, you not guess( \nNeeded letter in started. \nTry again...");
		else System.out.println("\nSorry, you not guess( \nNeeded letter in the end. \nTry again...");
	}
	
}

}

