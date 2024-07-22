import  java.util.Scanner;

public class CarInsurance  {
  // A program to calculate insurance premiums
  // based on the driver’s age and accident
  // record.
  public static void main(String[] args)  {
    Scanner keyb = new Scanner(System.in);
    final double basicRate = 500;
    double rate;

    int  age, numAccidents;
    int  ageSurcharge = 0, accidentSurcharge = 0;
    boolean error = false, tooMany = false;

    // Input driver's age and number of
    // accidents
    System.out.println("How old is the driver?");
    age = keyb.nextInt();
    
    System.out.println("How many accidents has "
 			+ "the driver had?");
    numAccidents = keyb.nextInt();

    // Determine if there is an age surcharge
    if (age < 0)
      error = true;
    else if (age < 25)
      ageSurcharge = 100;
    else
      ageSurcharge = 0;

    // Determine if there is a surcharge
    if (numAccidents < 0)
      error = true;
    else if (numAccidents == 0)
      accidentSurcharge = 0;
    else if (numAccidents == 1)
      accidentSurcharge = 50;
    else if (numAccidents == 2)
      accidentSurcharge = 125;
    else if (numAccidents == 3)
      accidentSurcharge = 225;
    else if (numAccidents == 4)
      accidentSurcharge = 375;
    else if (numAccidents == 5)
      accidentSurcharge = 575;
    else
      tooMany = true;

    // Print the charges
    if (error)
      System.out.println("There has been an "
                 + " error in the data that "
                 + " you supplied");
    else if (tooMany)
      System.out.println("You have had too "
                   + "many accidents for me to "
                   + " insure you.");
    else {
      System.out.println("The basic rate is $"
                               + basicRate);
      if (ageSurcharge > 0)
        System.out.println("There is an extra "
                  + "surcharge of $" 
                  + ageSurcharge 
                  + " because the driver is"
                  + " under 25.");
     if (accidentSurcharge > 0)
        System.out.println("There is an extra "
             + " surcharge of $" + accidentSurcharge
             + " because the driver had "
             + numAccidents + " accident(s).");
      
      rate = basicRate + ageSurcharge 
                      + accidentSurcharge;
      System.out.println("The total charge is $"
                         + rate);
    }
  }
}