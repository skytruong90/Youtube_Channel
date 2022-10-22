// Given the temperature in Celsius: output the temperature in fahrenheit.
// Challenge: Limit the fahrenheit output to only 2 decimal places.
// The solution will be in the github source code linked in the description.
// The formula for Celsius to Fahrenheit is: [C / 5 = (F - 32) / 9]

// Importing scanner so we can use it to get input from user later.
import java.util.Scanner;

// The name of the code (and save file).
public class convertToFahrenheit {
   // The magic line needed to start java programs.
   public static void main(String [] args) {
      // Initialize scanner object to get input from the user.
      Scanner scnr = new Scanner(System.in);
      
      // Indicate to the user what we are looking for.
      System.out.print("Enter Celsius Temperature: ");
      // We assign the number given to us by the user to celsius.
      double celsius = scnr.nextDouble();
      // We assign the converted number to fahrenheit. We are dividing celsius by 5 and 
      // then multiplying the divided number by 9. After that, we add 32 and we get the
      // correct answer.
      double fahrenheit = ((celsius / 5) * 9) + 32;
      
      // The OLD output without limiting the decimal places.
   // System.out.println("Temperature in fahrenheit: " + fahrenheit);
      
      // The solution to the challenge: Output while limited the digits after the decimal 
      // to only two places. Note the "%.2f" is what is causing this.
      System.out.printf("Temperature in fahrenheit: %.2f", fahrenheit);
   }
}