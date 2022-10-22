// Given a first name, middle name, and last name: format the name to be last name, first initial and middle initial.
// EXAMPLE:                      CORNER CASE: Only given First and Last name
// Input: Jason Skilled Apple          Input: Jason Apple
// Output: Apple, J. S.               Output: Apple, J.
// YT Video: https://youtu.be/qMliviJV20E

// Import Scanner Object
import java.util.Scanner;

// Name class (and save file)
public class NameFormatting {
   // Tell Java that the program starts here.
   public static void main(String [] args) {
      // Create Scanner object (allowing us to get input from user)
      Scanner scnr = new Scanner(System.in);
      // Create fullName String variable, get next entire line of text from user input.
      String fullName = scnr.nextLine();
      // Break fullName text into seperate parts using an array.
      // REMEMBER: the [] after name[] is what causes it to be an array.
      // I love arrays.
      String name[] = fullName.split(" ");
      
      // If the length of the name is greater than 2 (so 3. This could have been == 3).
      if (name.length > 2) {
         // Print what the problem wants. If you're confused here, check out the video again where I
         // break down what is going on here.
         System.out.println(name[2] + ", " + name[0].charAt(0) + ". " + name[1].charAt(0) + "."); 
      } else {
         System.out.println(name[1] + ", " + name[0].charAt(0) + ".");
      }
   }
}