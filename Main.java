
import java.util.Scanner;
/**
* A program to say hello to a user and calculate their approximate age
* @author Ahmad Zeshan
*/
public class Main {

 /**
  * The method that is executed when you hit the run button.
  * @param args the command line arguments
  */
 public static void main(String[] args) {
	 //create a scanner for user input 
	 Scanner input = new Scanner(System.in);

   // declare a variable that will store a name
   String userName;

   // ask the user for their name
   System.out.println("Please enter your name:");
   // initialize the name variable with Bob
   userName = input.nextLine();
   // Say hello to the user
   System.out.println("Hello " + userName + "!");
  
   // declare and initialize a constant to store the current year
   int CURRENT_YEAR = 2020;
   // Ask the user for the year they were born
   System.out.println("Please enter the year you were born:");
   // declare and initialize a variable to store the year they were born
   int birthYear = input.nextInt();

   // declare and calculate their age
   int age = CURRENT_YEAR - birthYear;
   // Tell the user their age
   System.out.println("You are " + age + " years old.");

 }
}

