# java_projects_1  

A collection of java practice projects.


## drawDiamond  
 
This program prints a diamond shape pattern on the console using two characters:  
one for the diamond body and another for the empty spaces around it.  
  
The pattern is symmetrical both horizontally and vertically, 
forming a diamond shape. The length of the sides of the diamond 
is determined by `lengthOfSide`.  
  
@param emptyCharacter the character used to represent empty spaces  
@param diamondCharacter the character used to represent the body of the diamond  
@param lengthOfSide recommendation: MAX VALUE 180, MIN VALUE 2  
  
### Summary:  
Outer loop (rowIndex): Controls the number of rows printed, which is 
determined by (lengthOfSide * 2) - 1. (The middle row is the widest.)  
  
Inner loop (columnIndex): Controls printing each character in a row. For each row, characters are 
printed in two phases:  
  
The first phase prints empty characters (whitespace).  
  
The second phase prints the diamond characters.  
  

Whitespace and diamond adjustments: After each row is printed, the number of 
whitespaces is decreased and the number of diamond characters is increased until the 
middle of the diamond is reached. After the middle, the direction switches and the number of 
whitespaces increases while the diamond characters decrease, forming the lower half of the diamond.  
  
Reset (whitespaceIndex, diamondIndex): After printing each row, these indices are 
reset for the next row.

### Output Example (when lengthOfSide = 4):  

```
   *
  ***
 *****
*******
 *****
  ***
   *
```


## drawHouse  

This program draws a simple house using ASCII characters.
The house consists of two parts:   
-- A triangular roof made of "diamond characters" ('*').  
-- A rectangular base, also made of "diamond characters".  
 
The size of the house is determined by the 'lengthOfSide' variable, which
controls both the size of the roof and the base.  

The first part of the code: Drawing the roof (triangular shape)
The roof consists of 'lengthOfSide' rows, forming a triangle  

The second part of the code: Drawing the base (rectangular shape)
The base is a rectangle with a width of (lengthOfSide * 2 - 1) "diamond characters"
and a height of 'lengthOfSide'  


### Code Explanation:  
#### 1 Variables:  

emptyCharacter: A space character (" "), used to add padding before printing "diamond characters".  
diamondCharacter: The character used to form the roof and base ("*").  
lengthOfSide: Controls the size of the house, particularly the height and width of the roof and base.  
numberOfWhitespace: The number of spaces before the "diamond characters" in the current row. It starts at lengthOfSide - 1 and decreases each row.  
numberOfDiamond: The number of "diamond characters" in the current row, starting at 1 and increasing by 2 for each new row.  
whitespaceIndex and diamondIndex: Track how many whitespaces or "diamond characters" have been printed in a row.  

#### 2 Roof Drawing (First Loop):  

The outer loop (for (int rowIndex = 0; rowIndex < lengthOfSide; rowIndex++)) runs for each row of the roof.  
Each row is composed of a number of emptyCharacters followed by "diamondCharacters".  
The number of whitespaces decreases by 1 for each new row, and the number of "diamond characters" increases by 2, giving the triangular shape.  

#### 3 Base Drawing (Second Loop):  

After the roof is printed, the base is drawn as a rectangle using another loop.  
The base has the same height as the roof (lengthOfSide rows), but each row has a fixed width of (lengthOfSide * 2) - 1 "diamond characters".  


### Output Example (when lengthOfSide = 4):  

```
   *
  ***
 *****
*******
*******
*******
*******
*******
```


## drawTriangle  

This program draws a simple right-aligned isosceles triangle using ASCII characters.
 
The triangle is drawn with a height and width defined by the 'lengthOfSide' variable.  
The triangle is formed by printing whitespace characters followed by "diamond characters".  
 
The size of the triangle can be adjusted by changing the `lengthOfSide` value.  


### Code Explanation:  
#### 1 Variables:  

emptyCharacter: Defines the character for the empty spaces (whitespace) before the "diamond characters". It is represented by Unicode \u0020, which corresponds to a space.  
diamondCharacter: Defines the character for the triangle body ("*").  
lengthOfSide: Determines the height and half the width of the triangle. It also controls the number of rows and how the triangle expands.  
numberOfWhitespace: Starts at lengthOfSide - 1 and decreases with each row. This represents the number of spaces before the "diamond characters", creating the triangle shape.  
numberOfDiamond: Starts at 1 and increases by 2 in each row, expanding the triangle.  
whitespaceIndex and diamondIndex: Keep track of how many whitespaces and "diamond characters" are printed in each row.  

#### 2 Triangle Drawing Logic:  

Outer loop (for (int rowIndex = 0; rowIndex < lengthOfSide; rowIndex++)): Controls the number of rows printed, where each row corresponds to a part of the triangle.  
Inner loop (for (int columnIndex = 0; columnIndex < lengthOfSide; columnIndex++)): Handles the printing of whitespaces and "diamond characters" for each row.  
diamondCharacter printing: Before printing "diamond characters", a certain number of spaces are printed (numberOfWhitespace). This number decreases as the rows progress to create the triangle's left-aligned shape.  
Diamond printing: After the whitespace, "diamond characters" (numberOfDiamond) are printed. This number increases by 2 for each subsequent row, forming the expanding shape of the triangle.  
After each row is printed, the number of whitespaces decreases, and the number of "diamond characters" increases, creating the visual effect of a growing triangle.  

#### 3 Reset Mechanism:

After each row is printed, the whitespaceIndex and diamondIndex are reset to 0 to start fresh for the next row.


### Output Example (when lengthOfSide = 4):  

```
   *
  ***
 *****
*******
```

