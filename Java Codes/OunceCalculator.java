// Given both pounds and ounces, calculate the total number of ounces.
// Example: 4 pounds 2 ounces should output 66 ounces.
// YouTube video: https://youtu.be/WsfJieOImSg

// Import Scanner to get user input.
import java.util.Scanner;

// Create program and name it.
public class OunceCalculator {
   // Use the following words to let Java know it's time to run the code.
   public static void main(String [] args) {
      // Create a new Scanner object (allowing you to get input from user)
      Scanner scnr = new Scanner(System.in);
      
      // Prompt user on with .print to enter pounds.
      System.out.print("Enter pounds: ");
      // Create and assign a value to the pounds variable.
      int pounds = scnr.nextInt();
      // Prompt user to enter ounces.
      System.out.print("Enter ounces: ");
      // Create and assign an integer value to the ounces variable.
      int ounces = scnr.nextInt();
      
      // Output the total number of ounces AND calculate the pounds + ounces all at once.
      System.out.println("Total number of ounces: " + ((pounds * 16) + ounces) + ".");
      
      // Alternatively, you could have broken the equation into a seperate variable.
      /* Example:
       * // Create answer variable, and compute the value of total ounces.
       * int answer = ((pounds * 16) + ounces);
       * System.out.println("Total number of ounces: " + answer);
       */
   }
}
      