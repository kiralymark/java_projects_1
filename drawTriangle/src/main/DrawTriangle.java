package main;

/*
 * This program prints a simple triangle using ASCII characters.
 * 
 * The triangle is drawn with a height and width defined by the 'lengthOfSide' variable.
 * The triangle is formed by printing whitespace characters followed by "diamond characters".
 * 
 * The size of the triangle can be adjusted by changing the 'lengthOfSide' value.
 */
public class DrawTriangle {

	public static void main(String[] args) {

		// The character used for empty spaces (whitespace)
		final String emptyCharacter = "\u0020";		// using Unicode for the 'space' character
		
		// The character used for the "diamondCharacter" (forming the triangle)
		final String diamondCharacter = "*";
		
		
		// Length of the side of the triangle (both height and half the base width)
		int lengthOfSide = 4;						// recommendation: MAX VALUE 180, MIN VALUE 2
		
		// Initial number of whitespaces before the first "diamondCharacter" in each row
		int numberOfWhitespace = lengthOfSide-1;

		// Initial number of "diamond characters" in the first row of the roof
		int numberOfDiamond = 1;
		
				
		// Index variables to track position during whitespace and "diamondCharacter" printing
		int whitespaceIndex = 0;
		
		int diamondIndex = 0;
		

		// Outer loop: Iterates over the number of rows, which equals 'lengthOfSide'
		for (int rowIndex = 0; rowIndex < lengthOfSide; rowIndex++) {
			
			// Inner loop: Iterates over each column in the current row
			for (int columnIndex = 0; columnIndex < lengthOfSide; columnIndex++) {

				// Print whitespaces before the "diamond characters" in each row
				while(whitespaceIndex != numberOfWhitespace) {
					
					System.out.print(emptyCharacter);			// Print a single empty space
										
					whitespaceIndex++;

				}
				
				// Print "diamond characters" after the whitespaces
				while(diamondIndex != numberOfDiamond) {
					
					System.out.print(diamondCharacter);			// Print a single "diamondCharacter"
					
					diamondIndex++;
					
				}
				
			}
			
			// After printing each row:
			// Decrease the number of whitespaces and increase the number of "diamond characters"
			numberOfWhitespace--;					// Reduce whitespace for the next row
				
			numberOfDiamond += 2;					// Increase "diamond characters" by 2 (forming the expanding triangle)
			
			// Reset the indices for the next row
			whitespaceIndex = 0;
			 
			diamondIndex = 0;
				
			// Move to the next line after completing the current row		
			System.out.println();
			
		}
		
		
	}

}
