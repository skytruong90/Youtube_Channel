// Create a java program that removes gray from an RGB value.
// This will use 3 values, (R)ed (G)reen & (B)lue.
// If all 3 numbers are equal, the color should be 0, 0, 0 (Which is black).
// YT video: https://youtu.be/9DdkI_x7Dfw

// Import scanner functionality.
import java.util.Scanner;

// Name class
public class RGBGrayRemover {
   
   // Let Java knows it's time to start.
   public static void main(String [] args) {
      
      // Create Scanner object to get input from user.
      Scanner scnr = new Scanner(System.in);
      
      // Inform user what we want from them.
      System.out.print("Enter 3 values for RGB seperated by a space: ");
      int r = scnr.nextInt(); // red integer value
      int g = scnr.nextInt(); // green integer value
      int b = scnr.nextInt(); // blue integer value
      
      // Check if red is both less than green and blue
      // Subtract red from all 3 values if so.
      if (r < g && r < b) {
         g -= r;
         b -= r;
         r -= r;
       }
      // Check if green is both less than red and blue
      // Subtract green from all 3 values if so.
       else if (g < r && g < b) {
         r -= g;
         b -= g;
         g -= g;
       }
      // Check if blue is both less than red and green
      // Subtract blue from all 3 values if so.
       else if (b < r && b < g) {
         r -= b;
         g -= b;
         b -= b;
       }
      // Check if blue is equal in value to both green and red
      // Subtract all values down to 0 if so.
       else if (b == g && b == r) {
         r -= b;
         g -= b;
         b -= b;
       }
       
       // Print resulting color values.
       System.out.println(r + " " + g + " " + b);
      
   }
}