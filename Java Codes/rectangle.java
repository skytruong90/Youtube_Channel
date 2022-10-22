// Given the length and width of a rectangle from a user, calculate the perimeter of a rectangle
// 2 * (L x W)

// This imports the Scanner Class, which is used to gather input from a user.
import java.util.Scanner; 

// This names our project, which in this case is "rectangle"
public class rectangle {

   // This next line is required early on. You'll see this a lot, so memorize it.
   public static void main(String [] args) {
   
      // This is used to initialize the Scanner object. 
      // Note: "scnr" could be any other name you decide. For example: "myScanner" would also work.
      Scanner scnr = new Scanner(System.in);
      
      // Remember to use .print instead of .println so that the text is more neat when being output.
      System.out.print("Enter length: ");
      // We are telling Java that we want our variable "length" to be an integer, and to gather a number 
      // from the user by calling the Scanner object we made earlier (scnr in this case).
      int length = scnr.nextInt();
      
      System.out.print("Enter width: ");
      int width = scnr.nextInt();
      
      // We create a new variable, answer, and use the correct calculation needed.
      // Recall that although the parantheses aren't required here, they can help with readability.
      int answer = 2 * (length * width);
      
      // Finally, we output the answer. Remember to concatenate using the + symbol.
      System.out.println("The perimeter of the rectangle is " + answer + ".");
    
   // A common mistake is to forgot these closing curly braces. It happens to everyone.    
   }
}

