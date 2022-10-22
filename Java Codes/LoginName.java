// if 	 input: Michael Jordan 1963
// then	output: Your login name: JordaM63
// if    input: Kanye West 2020
// then output: Your login name: WestK20
// YT Video: https://youtu.be/x3amWjHF5oU

// Imports scanner to get input from user.
import java.util.Scanner;

// Create class LoginName
public class LoginName {
	// Tell Java that this is the main method
	public static void main(String[] args) {
		// Initialize Scanner and call it scnr.
		Scanner scnr = new Scanner(System.in);
		// Create string for first name, and get it from user.
		String fName = scnr.next();
		// Create string for last name, and get it from user.
		String lName = scnr.next();
		// Create integer var for digits, and get those from user.
		int digits = scnr.nextInt();
		
		// Prepare digits for username.
		digits = digits % 100;
		
		// If the length of lName is greater than or equal to 5, we only want the first 5 letters.
		if (lName.length() >= 5) {
			// substring(0, 5) starts at 0 and outputs indexes 0, 1, 2, 3, 4. NOT 5.
			// charAt takes the first letter of the fName String.
			System.out.println("Your login name: " + lName.substring(0, 5) + fName.charAt(0) + digits);
		} else
			System.out.println("Your login name: " + lName + fName.charAt(0) + digits);
		
	}
} 
