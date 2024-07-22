import java.util.Scanner;

public class IsItNegative  {
  // Tell a user if a number is negative or
  // non-negative
  public static void main(String[] args)  {
    Scanner keyb = new Scanner(System.in);
    
    // Ask the user for a number
    System.out.println
               ("Please enter a number?");
    double number = keyb.nextDouble();

    // Print whether the number is negative or not
    if (number < 0.0)
      System.out.println(number 
                  + " is a negative number");
    else
      System.out.println(number 
                + " is NOT a negative number");
  }
}
