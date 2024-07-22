import java.util.Scanner;

public class PayrollWithComments  {

  // This program calculates the gross pay for an
  // hourly worker
  // Inputs - hourly rate and hours worked
  // Output - Gross pay
  public static void main(String[] args)  {
    Scanner keyb = new Scanner(System.in);
    // Get the hourly rate
    System.out.println
            ("What is your hourly pay rate?");
    double rate = keyb.nextDouble();

    // Get the hours worked
    System.out.println
          ("How many hours did you work?");
    double hours = keyb.nextDouble();
    
        // Calculate and display the gross pay
    double gross = rate * hours;
    System.out.println("Your gross pay is $" 
                      + gross);
  }
}
