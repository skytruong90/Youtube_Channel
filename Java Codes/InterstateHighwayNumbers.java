// YT video: https://youtu.be/Z6cxt53_pNI
/* Primary U.S. interstate highways are numbered 1-95. 
 * Odd numbers (like the 11 or 95) go north & south. Even numbers (like the 6 or 90) go east & west. 
 * Auxiliary highways are numbered 100-999 and they service the primary highway indicated by the 
 * rightmost two digits. Thus, I-411 services I-11, and I-290 services I-90. 
 * Note: 300 is not a valid auxiliary highway because 00 is not a valid primary highway number.
 *
 * Given a highway number, indicate whether it is a primary or auxiliary highway. 
 * If auxiliary, indicate what primary highway it serves. Also indicate if the (primary) highway 
 * runs north/south or east/west.
*/

// Example: If input is 80
// Output is: I-80 is primary, going east/west.
// If input is 280
// Output is: I-280 is auxiliary, serving I-80, going east/west.
// Corner Case #1: If input is 0
// Output is: 0 is not a valid interstate highway number. 
// Corner Case #2: If input is 300
// Output is: 300 is not a valid interstate highway number. 

// As always, fully notated code is available on my github and shared in the description.

// Import Scanner Class and begin.
import java.util.Scanner;

// Create class for this program (name of save file).
public class InterstateHighwayNumbers {
   // Let Java know that this is where the program should start.
   public static void main(String [] args) {
      // Initialize Scanner object to get input from user.
      Scanner scnr = new Scanner(System.in);
      // Create highwayNumber and primaryNumber to hold our values for the logic we use later.
      int highwayNumber;
      int primaryNumber;
      // Create northSouth boolean to determine whether the road is north/south or east/west
      boolean northSouth;
      // This String will allow us to plug in the direction when we get to where we need to print.
      String direction;
      // This will make sure that our number is not 0/100/200/300/etc.
      boolean validNumber = true;
      
      // We will assign highwayNumber with the number given to us by the user.
      highwayNumber = scnr.nextInt();
      
      // If the number % 2 is equal to 0, then the number is even and thus east/west
      if (highwayNumber % 2 == 0) {
         // Set northSouth to false so the program knows that it is an east/west road.
         northSouth = false;
      } else {
         // If it's not east/west, then it must be north/south.
         northSouth = true;
      }
      
      // Check to see if the number is 0/100/200/300/etc. If it is, then the number is invalid.
      if (highwayNumber % 100 == 0) {
         // Set validNumber to false so the program knows that we can't use this number.
         validNumber = false;
      }
      
      // This will assign a string to the direction variable we initialized earlier.
      if (northSouth == true) {
         // If northSouth is true, it's north/south.
         direction = "north/south";
      } else {
         // If northSouth is false, it's east/west.
         direction = "east/west";
      }
      
      // We check to see if the number represents an auxiliary road. This is true if the number is
      // both greater than 99 AND a valid non-zero number.
      if (highwayNumber > 99 && validNumber == true) {
         // We set the primary number to highwayNumber. This probably should have been:
         // highwayNumber = primaryNumber % 100  , but this works the way it is. It's just kind of pointless...
         primaryNumber = highwayNumber;
         // We combine all of the different variables we set up and create an output that meets the
         // requirements as set in the beginning.
         System.out.println("I-" + primaryNumber + " is auxiliary, serving I-" + (highwayNumber % 100) + ", going " + direction + ".");
      } 
      // If it's less than 100 and a valid number, then it's a primary highway.
      else if (validNumber == true) {
         // We combine the different variables and output the correct text.
         System.out.println("I-" + highwayNumber + " is primary, going " + direction + ".");
      } else {
         // If it's not a valid number, then we shall state such.
         System.out.println(highwayNumber + " is not a valid interestate highway number.");
      } 
            
   }
}