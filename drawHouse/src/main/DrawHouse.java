package main;

/*
 * This program draws a simple house using ASCII characters.
 * The house consists of two parts: 
 * 1. A triangular roof made of "diamond characters" ('*').
 * 2. A rectangular base, also made of "diamond characters".
 * 
 * The size of the house is determined by the 'lengthOfSide' variable, which
 * controls both the size of the roof and the base.
 */
public class DrawHouse {

	public static void main(String[] args) {

		// The character used for empty spaces (whitespace)
		final String emptyCharacter = "\u0020";		// using Unicode for the 'space' character

		// The character used for the "diamondCharacter" (roof and base)
		final String diamondCharacter = "*";
		
		
		// Defines the length of the side of the triangular roof and the base width
		int lengthOfSide = 4;						// recommendation: MAX VALUE 180, MIN VALUE 2
		
		// Initial number of whitespaces before the first "diamondCharacter" in each row
		int numberOfWhitespace = lengthOfSide-1;

		// Initial number of "diamond characters" in the first row of the roof
		int numberOfDiamond = 1;
		
		
		// Index variables to track position during whitespace and "diamondCharacter" printing
		int whitespaceIndex = 0;
		
		int diamondIndex = 0;
		

		/* First part: Drawing the roof (triangular shape)
		 * The roof consists of 'lengthOfSide' rows, forming a triangle
		 */
		for (int rowIndex = 0; rowIndex < lengthOfSide; rowIndex++) {
			
			// Each row consists of a combination of whitespaces and "diamond characters"
			for (int columnIndex = 0; columnIndex < lengthOfSide; columnIndex++) {

				// Print the necessary number of whitespaces before the "diamond characters"
				while(whitespaceIndex != numberOfWhitespace) {
					
					System.out.print(emptyCharacter);
										
					whitespaceIndex++;

				}
				
				// Print the necessary number of "diamond characters" after the whitespaces
				while(diamondIndex != numberOfDiamond) {
					
					System.out.print(diamondCharacter);
					
					diamondIndex++;
					
				}
				
			}
						
			// After each row, decrease the number of whitespaces and increase the "diamond characters" by 2
			// to form the triangular shape
			numberOfWhitespace--;
				
			numberOfDiamond += 2;
			
			// Reset the indices for the next row
			whitespaceIndex = 0;
			 
			diamondIndex = 0;
				
			// Move to the next line (move to the next row) 			
			System.out.println();
			
		}
		
		
		/* Second part: Drawing the base (rectangular shape)
		 * The base is a rectangle with a width of (lengthOfSide * 2 - 1) "diamond characters"
		 * and a height of 'lengthOfSide'
		 */
		diamondIndex = 0;	// Reset the index for the base
		
		for (int rowIndex = 0; rowIndex < lengthOfSide; rowIndex++) {
			
				// Print a full row of "diamond characters"
				while(diamondIndex != (lengthOfSide*2)-1) {
					
					System.out.print(diamondCharacter);
					
					diamondIndex++;
				}
				
				// Reset the index for the next row
				diamondIndex = 0;
									
				// Move to the next line (move to the next row)
				System.out.println();
				
		}
		

	}

}
