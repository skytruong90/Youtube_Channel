// Given a distance in yards, we want to convert the distance into feet and inches.
// If input is 3, output should be 9 and 108 respectively.
// YouTube video: https://youtu.be/Ou5h7rLdwRo

// Import scanner to gather input from user
import java.util.Scanner;

// This lets Java know the program name, and it should match the save file name.
public class YardConverter {
   // This line will be used over and over again; memorize it. 
   public static void main(String [] args) {
      // Initialize the Scanner as scnr (used to get input from user)
      Scanner scnr = new Scanner(System.in);
      
      // Prompt user of what you are wanting from them.
      System.out.print("Enter distance in yards: ");
      // Create and assign a value to yards. Here we use a double so that decimals will work.
      double yards = scnr.nextDouble();
      // Create feet, and since there are 3 feet in a yard, we multiply yards by 3.
      double feet = (yards * 3);
      // Create inches, and since there are 12 inches in a foot, we multiply feet by 12.
      double inches = (feet * 12);
      
      // Output to the user what the numbers mean. In this case, feet.
      // Note that System.out.println is used to create a new line. This also means that it does not
      // limit the amount of decimal places.
      System.out.println("Total feet: " + feet);
      
      // This next output will give inches, but notice that it's printf instead of println.
      // The main difference here is that this line, due to the "%.1f" will limit the decimal places to 
      // only 1 digit after the decimal.
      // The second main difference here is instead of "+ inches", it is ", inches".
      System.out.printf("Total inches: %.1f", inches);
      
      // You may want to play around with the .printf output to see what you can do with it!
      // Remember, the "%.1f" is the specific portion that tells it how many decimal points to include.
      
   }
}