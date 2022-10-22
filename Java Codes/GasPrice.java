// Given the price per gallon of gas and the number of gallons, compute the total cost of gas.
// We will do this in TWO ways. One with purely integers, and once with double variables.

// This imports the Scanner Class, which is used to gather input from a user.
import java.util.Scanner;

// This names our project, which in this case is "GasPrice"
public class GasPrice {

   // This next line is required early on. You'll see this a lot, so memorize it.
   public static void main(String [] args) {
   
      // Set up scanner
      Scanner scnr = new Scanner(System.in);
      
      // Ask user what the price per gallon is. Set up variables.
      System.out.print("Enter the price per gallon: ");
      // Remember that for double variables, you must use scnr.nextDouble instead of .nextInt
      double pricePerGallon = scnr.nextDouble();
      System.out.print("Enter the number of gallons: ");
      double numberOfGallons = scnr.nextDouble();
      
      // Output cost of gas with dollar sign.
      System.out.println("Total cost of gas is $" + (pricePerGallon * numberOfGallons));
      
      // Challenge: Can you figure out how to make the output only show 2 places after the decimal?
      // Example: 9.475 would become 9.47
      // Hint: You'll need to use System.out.printf
      //       If you're not sure what printf is, don't be afraid to look it up online!
      //       Looking stuff up is a resource to be used!
      // If you want the answer, I will post it 20 lines below this one in a comment.
   }
}



























// Answer to challenge: System.out.printf("Total cost of gas is $%.2f", (pricePerGallon * numberOfGallons));