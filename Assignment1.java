// Import libraries here
import java.util.Scanner;

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

  }
}
