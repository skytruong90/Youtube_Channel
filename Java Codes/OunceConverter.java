// Given only ounces: convert ounces into total pounds and ounces.
// Example: If given 36 ounces, the output should be 2 pounds and 4 ounces.
// YouTube video: https://youtu.be/anvrKLVj9uk

// Import scanner to gather input from the user.
import java.util.Scanner;

// Create and name project "OunceConverter"
public class OunceConverter { 
   // The magic words you need to memorize. These tell Java it's time to start the program.
   public static void main(String [] args) {
      // Initialize the Scanner object, allowing us to get input from the user.
      Scanner scnr = new Scanner(System.in);
      
      // using .print: Ask the user for ounces.
      System.out.print("Enter total ounces: ");
      // Create the ounces integer variable, and collect the value from the user using the
      // scnr object we created with Scanner on line 13.
      int ounces = scnr.nextInt();
      // Create pounds integer variable, and set it equal to ounces divided by 16.
      // Why? There are 16 ounces per pound, and it will automatically round down.
      int pounds = ounces / 16;
      // We will create one last variable to store the remainder from the division above.
      // Remember, the modulo ( % ) operator finds the remainder based on the number given
      // to the right of it. Below it is checking for the modulo when divided by 16.
      int remainderOunces = ounces % 16;
      
      // Output the values in a nice print statement for the user to read.
      System.out.println(pounds + " total pound(s) and " + remainderOunces + " ounce(s).");
   }
}