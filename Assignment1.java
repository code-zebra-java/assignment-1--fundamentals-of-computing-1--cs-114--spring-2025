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
    Scanner scan = new Scanner(System.in);

    System.out.println("Please enter a number in Fahrenheit: ");

    double fahrenheit = scan.nextDouble();

    double celsius = (fahrenheit-32)*(5/9);

    scan.close();

    //Question 3: take a 5 charcter string and delete first and last character and save the reverse.

    //Question 4: generate and save a random number between 32 to 16384 inclusive
    Random generator = new Random();

    int randomNum = generator.nextInt((16385-32))+32;


  }
}
