// Given the scores of X students from a test, calculate the average score and
// print it to once decimal place.

// Import Scanner to get input from user later.
import java.util.Scanner;

// Create class name (and name of save file)
public class averageScore {
   // Let Java knows it's time for business.
   public static void main(String [] args) {
      // Initialize Scanner and call it scnr. This'll allow us to gather input from user.
      Scanner scnr = new Scanner(System.in);
      
      // Inform user what we want from them. In this case, # of students.
      System.out.print("Enter number of students: ");
      // Create an int (there can't be half a student) var named students, then use scnr.nextInt()
      // to get the value from the user.
      int students = scnr.nextInt();
      // Create totalScore variable to hold the total value of the scores as they add up in the loop
      // that's created later.
      double totalScore = 0;
      
      // Inform the user to enter each score seperated by a space all on one line.
      // NOTE: It'll still work if they do it one score per line at a time.
      System.out.println("Enter all scores seperated by a space.");
      // Set i = 0. This is very important as it controls how many times the while loop will continue.
      int i = 0;
      // Set up the while loop. We have i (which = 0) and students (which is equal to the value given to
      // us by the user earlier on). This means when i is equal to the number of students, STOP looping.
      while (i < students) {
         // This will take a numeric value from the user and ADD it to the totalScore.
         // This is why we initially set totalScore to 0, so it could be added upon here.
         totalScore += scnr.nextDouble();
         // It is extremely important to have i++ here. It tells jave to add a value of 1 to its
         // existing value. So 1 becomes 2, 5 becomes 6, etc. Without this, the loop runs forever.
         i++;
      }
      // Here we create a new variable, avgScore, and set it equal to the totalScore divided by i.
      // Alternatively, this code would also work with totalScore divided by students.
      // It's actually very likely to be MORE correct to use students instead of i here.
      double avgScore = (totalScore / students);
      // Using printf, we can output the average score and cap the digits after the decimal to one
      // by using "%.1f".
      System.out.printf("The average score is equal to %.1f.", avgScore);
      
   }
}