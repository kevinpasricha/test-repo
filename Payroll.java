import java.util.Scanner;

public class Payroll  {
  public static void main(String[] args)  {
    Scanner keyb = new Scanner(System.in);
    
    System.out.println
               ("What is your hourly pay rate?");
    double rate = keyb.nextDouble();
    System.out.println
              ("How many hours did you work?");
    double hours = keyb.nextDouble();
    
    double gross = rate * hours;
    System.out.println("Your gross pay is $"
                        + gross);
  }
}
