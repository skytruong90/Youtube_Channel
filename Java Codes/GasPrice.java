// Given the price per gallon of gas and the number of gallons, compute the total cost of gas.


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
      
   }
}



























// Answer to challenge: System.out.printf("Total cost of gas is $%.2f", (pricePerGallon * numberOfGallons));
