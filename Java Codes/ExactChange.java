// Write a program: Given total change amount in pennies as an integer input, output the change using the fewest coins, one coin type per line. 
// The coin types are Dollars, Quarters, Dimes, Nickels, and Pennies. Use singular and plural coin names as appropriate, like 1 Dollar vs. 2 Dollars.
// YouTube video: https://youtu.be/s2HfCRjvteo

// Import Scanner class to get input from user.
import java.util.Scanner;

// Create a class named ExactChange.
public class ExactChange {
   // Use this line to tell Java to start.
   public static void main(String [] args) {
      // Initialize a Scanner object and call it scnr
      Scanner scnr = new Scanner(System.in);
      
      // Create pennies variable, and ask for user to input the pennies.
      int pennies = scnr.nextInt();
      // Create the variables that will hold the other values for the other coins.
      int dollars = 0;
      int quarters = 0;
      int dimes = 0;
      int nickels = 0;
      // This boolean will make sure that the value is not zero.
      boolean wasChange = true;
      
      // We will check to see if the value is zero. If it is, we will print that there was no change, and we will set wasChange to false so that the
      // logic down the line will know that there was no change.
      if (pennies == 0) {
         System.out.println("There was no change.");
         wasChange = false;
      }
      // This block checks for dollars. It will divide to get the dollar amount. Then, it'll use modulo to find remaining pennies.
      if (pennies >= 100) {
         dollars = (pennies / 100);
         pennies = pennies % 100;
      }
      // This block checks for quarters. Same process as before.
      if (pennies >= 25) {
         quarters = pennies / 25;
         pennies = pennies % 25;
      }
      // This block checks for dimes.
      if (pennies >= 10) {
         dimes = pennies / 10;
         pennies = pennies % 10;
      }
      // This block checks for nickels.
      if (pennies >= 5) {
         nickels = pennies / 5;
         pennies = pennies % 5;
      }
      
      // We begin our print statements. We make sure that wasChange is true so Java knows whether or not to both with the following logic
      // The first part of this block checks for plural dollars (more than 1 dollar).
      if (wasChange == true && dollars > 1) {
         System.out.println(dollars + " Dollars.");
      } 
      // This second part of the block checks to see if there was a single dollar (assuming there wasn't more than 1 dollar to begin with)
      else if (wasChange == true && dollars == 1) {
         System.out.println(dollars + " Dollar.");
      }
      // Same as the first part of the block above, but with quarters
      if (wasChange == true && quarters > 1) {
         System.out.println(quarters + " Quarters.");
      } 
      // Same as second part of the block above, but with quarters.
      else if (wasChange == true && quarters == 1) {
         System.out.println(quarters + " Quarter.");
      }
      // Check for plural dimes.
      if (wasChange == true && dimes > 1) {
         System.out.println(dimes + " Dimes.");
      } 
      // Check for one dime.
      else if (wasChange == true && dimes == 1) {
         System.out.println(dimes + " Dime.");
      }
      // Check for plural nickels (which now that I think of it, is that even possible at this point?).
      if (wasChange == true && nickels > 1) {
         System.out.println(nickels + " Nickels.");
      } 
      // Check for a single nickel.
      else if (wasChange == true && nickels == 1) {
         System.out.println(nickels + " Nickel.");
      }
      // Check for plural pennies.
      if (wasChange == true && pennies > 1) {
         System.out.println(pennies + " Pennies.");
      } 
      // Check for a single penny.
      else if (wasChange == true && pennies == 1) {
         System.out.println(pennies + " Penny.");
      }
   // Congratulations, code complete!
   }
}