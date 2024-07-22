import java.util.Scanner;

public class SpeedWithConstant  {
  // Calculate the speed etc.
  public static void main(String[] args)  {
    Scanner keyb = new Scanner(System.in);
    final int speedLimit = 55;
    
    // Read in the distance in miles and 
    // time driven
    System.out.println
             ("How many miles have you driven?");
    double miles = keyb.nextDouble();
    System.out.println
              ("How many hours did it take?");
    double hours = keyb.nextDouble();

    // Calculate and print the speed
    double speed = miles / hours;
    System.out.println("You were driving at "
                  + speed + " miles per hour.");

    // Print the warning if appropriate
    if (speed > speedLimit)
       System.out.println("**BE CAREFUL!**" 
                  + "You are driving too fast!");
  }
}
