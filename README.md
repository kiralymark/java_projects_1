# java_projects_1  

A collection of java practice projects.


#### drawDiamond  
 
This program prints a diamond shape pattern on the console using two characters:  
one for the diamond body and another for the empty spaces around it.  
  
The pattern is symmetrical both horizontally and vertically, 
forming a diamond shape. The length of the sides of the diamond 
is determined by `lengthOfSide`.  
  
@param emptyCharacter the character used to represent empty spaces  
@param diamondCharacter the character used to represent the body of the diamond  
@param lengthOfSide recommendation: MAX VALUE 180, MIN VALUE 2  
  
Summary:  
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
