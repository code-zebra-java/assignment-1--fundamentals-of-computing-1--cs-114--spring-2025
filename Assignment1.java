// Import libraries here
import java.util.Scanner;
import java.util.Random;

public class Assignment1 {
  public static void main(String[] args) {

    //Question 1: print your initials in bold letters
    System.out.println(" T T T T T T T T T T T T " + "\t    S S S S S S S S");

    System.out.println(" T T T T T T T T T T T T " + "\t  S S S S S S S S S S");

    System.out.println(" T T T T T T T T T T T T " + "\t  S S S S   \t S S S");

    System.out.println("\t T T T T \t" + "\t   S S S S S S ");

    System.out.println("\t T T T T \t" + "\t      S S S S S S ");

    System.out.println("\t T T T T \t" + "\t\t S S S S S S ");

    System.out.println("\t T T T T \t" + "\t S S S \t      S S S S");

    System.out.println("\t T T T T \t" + "\t  S S S S S S S S S S");

    System.out.println("\t T T T T \t" + "\t    S S S S S S S S");

    //Question 2: Ask user for number in fahrenheit and convert the number to Celsius
    Scanner scan = new Scanner(System.in); //creates a scanner

    System.out.print("Please enter a number in Fahrenheit: "); //print a prompt to the user

    double fahrenheit = scan.nextDouble(); //scans the terminal for double input

    double conversionFactor = 5.0 / 9.0;  //creates a variable containing conversion factor
 
    double celsius = (conversionFactor * (fahrenheit - 32)); //carries out arithmetic operations to covert the given temperature


    //Question 3: take a 5 charcter string and delete first and last character and save the reverse.
    System.out.print("PLease enter 5 letters: "); //prints a prompt to the user

    String word = scan.next(); //scans the terminal for string input

    String middle = word.substring(2, 3); //shortens the given word

    char letterOne = word.charAt(1); //saves a character at index 1 as a variable

    char letterTwo = word.charAt(3); //saves a character at index 3 as a variable

    scan.close(); //closes the scanner

    //Question 4: generate and save a random number between 32 to 16384 inclusive
    Random generator = new Random(); //creates a random generator

    int randomNum = generator.nextInt((16385 - 32)) + 32; //the generator picks a randomnumber between 32 and 16384

    //Problem 5: print all the results of question 2-4 separating each by a new line
    System.out.println(fahrenheit + " degrees Fahrenheit in Celsius is: " + celsius + " degrees Celsius");

    System.out.println("Your new string is: " + letterTwo + middle + letterOne);

    System.out.println("A random number between 32 and 16,384: " + randomNum);


  }
}
