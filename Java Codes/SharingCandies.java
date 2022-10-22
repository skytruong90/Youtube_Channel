// You have candies in 3 jars. You need to distribute these candies equally among 4 friends.
// Any extra candies go to you. We will need to take 3 inputs which represent the number of
// candies per jar. Then, we'll output the number of candies that each friend will get.
// YT video: https://youtu.be/V2-4osXO1Wo

// Import scanner to get input from user.
import java.util.Scanner;

// Create class and name project
public class SharingCandies {
   
   // Use this to tell Java it's time to run the program.
   public static void main(String [] args) {
      
      // Create a Scanner object and call it scnr.
      Scanner scnr = new Scanner(System.in);
      
      // Inform the user what we want from them.
      System.out.print("Enter candy total from each jar, seperated by a space: ");
      
      // Create totalCandies variable, and collect the input 3 times.
      double totalCandies = scnr.nextDouble();
      totalCandies += scnr.nextDouble();
      totalCandies += scnr.nextDouble();
      
      // Create avg variable to hold the total value. It will be used to find average later.
      double avg = totalCandies;
      
      // Output the average number of candies while using a printf statement to limit decimal places.
      System.out.printf("Average number of candies per jar: %.2f\n", (avg / 3));
      
      // Output the rest of the information, and use (int) to turn the decimal value into a whole number.
      System.out.println("Number of candies for each friend: " + (int)(avg / 4));
      
      // Use (int) again and find the modulo so we know how many extra candies go to us.
      System.out.println("Number of candies left for you: " + (int)(totalCandies % 4));
   }
}