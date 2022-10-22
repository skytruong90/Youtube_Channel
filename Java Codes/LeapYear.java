// A year in the modern Gregorian Calendar consists of 365 days. In reality, the earth takes longer to rotate around the sun. 
// To account for the difference in time, every 4 years, a leap year takes place.
// Requirements:  1) The year must be divisible by 4
//                2) If the year is a century year (1700, 1800, etc.), the year must be evenly divisible by 400.
// YT Video: https://youtu.be/NwzWbyToRSM

// Import Scanner class
import java.util.Scanner;

// Create LeapYear class
public class LeapYear {
   // Declare this as main for Java to know where to start.
   public static void main(String [] args) {
      // Initalize Scanner object as scnr.
      Scanner scnr = new Scanner(System.in);
      // Create inputYear integer and assign it the year to be determined from the user.
      int inputYear = scnr.nextInt();
      // Create a boolean that will be used to determine wether to print if a year is a leap year or not.
      boolean isLeapYear = false;
      
      // Check the corner case first (determine whether a year is divisible perfectly by 400)
      // If so, it is a leap year.
      if ((inputYear % 400) == 0) {
         isLeapYear = true;
      }
      // Otherwise, check if the year is perfectly divisible by 4 and NOT divisible by 100.
      else if ((inputYear % 4) == 0 && (inputYear % 100) != 0) {
         isLeapYear = true;
      }
      
      // If leapYear was set to true, print the year and tell the user it is a leap year.
      if (isLeapYear == true) {
         System.out.println(inputYear + " is a leap year!");
      } else {
         // Otherwise, print the year and tell the user that it was not a leap year :(.
         System.out.println(inputYear + " is NOT a leap year :(");
      }
   }
}