package main;

public class DrawDiamond {

	public static void main(String[] args) {
		
		/*
		 * This program prints a diamond shape pattern on the console using two characters: 
		 * one for the diamond body and another for the empty spaces around it.
		 * 
		 * The pattern is symmetrical both horizontally and vertically, 
		 * forming a diamond shape. The length of the sides of the diamond 
		 * is determined by 'lengthOfSide'.
		 */

		final String emptyCharacter = "\u0020";			// the character used to represent empty spaces
		final String diamondCharacter = "*";			// the character used to represent the body of the diamond
		
		int lengthOfSide = 4;							// recommendation: MAX VALUE 180, MIN VALUE 2
		int numberOfWhitespace = lengthOfSide-1;
		int numberOfDiamond = 1;
			
		int whitespaceIndex = 0;
		int diamondIndex = 0;
		
		boolean isDirectionSwitched = false;
		
		// Controls the number of rows printed
		for (int rowIndex = 0; rowIndex < (lengthOfSide*2)-1; rowIndex++) {
			
			// Controls printing each character in a row (Iterate over each column in the current row)
			for (int columnIndex = 0; columnIndex < (lengthOfSide*2)-1; columnIndex++) {

				// Print empty characters (whitespace) until we reach the numberOfWhitespace count
				while(whitespaceIndex != numberOfWhitespace) {
					System.out.print(emptyCharacter);				
					whitespaceIndex++;

				}
				
				// Print diamond characters until we reach the numberOfDiamond count
				while(diamondIndex != numberOfDiamond) {
					System.out.print(diamondCharacter);
					diamondIndex++;
					
				}
				
			}

			// Adjust the number of whitespaces and diamond characters after each row
			// (If we're in the top half of the diamond, before reaching the middle)
			if((numberOfWhitespace != 0) && (!isDirectionSwitched)) {
				// Decrease whitespace and increase diamond characters for the next row
				numberOfWhitespace--;
				numberOfDiamond += 2;
				
				// When the number of whitespaces is 0 (reaching the middle of the diamond), 
				// switch direction to start decreasing diamond characters and increasing whitespaces
				if(numberOfWhitespace < 1) {
					isDirectionSwitched = !isDirectionSwitched;
					
				}
				
			// If we're in the bottom half of the diamond (after the middle)
			} else if((numberOfWhitespace < lengthOfSide-1 ) && (isDirectionSwitched)) {
				// Increase whitespace and decrease diamond characters for the next row
				numberOfWhitespace++;
				numberOfDiamond -= 2;
				
			}
			
			// Reset indices for whitespace and diamond characters for the next row
			whitespaceIndex = 0;
			diamondIndex = 0;
			// Move to the next line after completing the current row
			System.out.println();

		}

	}

}
