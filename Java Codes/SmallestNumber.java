// Given three (3) integers, and output the smallest of these three values.
// Example: Input is 8, 14, 4 ... Output should be 4.
// YT Video: https://youtu.be/Rjpk2555svw

// Import Scanner class
import java.util.Scanner;

// Create class (name of program is SmallestNumber)
public class SmallestNumber {
   // Create main to let Java know where to start.
   public static void main(String [] args) {
      // Initialize Scanner class
      Scanner scnr = new Scanner(System.in);
      
      // Set up num1 and temp, then user Scanner (scnr) to get first two numbers.
      int num1 = scnr.nextInt();
      int temp = scnr.nextInt();
      
      // Check if the second number is smaller than the first. If it is, replace the first number
      // with the second number.
      if (temp < num1) 
         num1 = temp;
      // Re-assign temp to hold the third number. We can do this now that we have dealth with the
      // second number.
      temp = scnr.nextInt();
      
      // Check if the third number is greater than whichever number was smaller out of the first
      // two numbers. If the third number is the smallest, we will print that number. Otherwise,
      // we would print the number being held in the num1 variable.
      if (temp < num1) {
         System.out.println(temp);
      } else {
         System.out.println(num1);
      }
      
   }
}