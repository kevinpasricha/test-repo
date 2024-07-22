import  java.util.Scanner;

public class CarInsurancewithSwitch  {
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
    switch(numAccidents)	{
        case 0: accidentSurcharge = 0; break;
        case 1: accidentSurcharge = 50; break;
        case 2: accidentSurcharge = 125; break;
        case 3: accidentSurcharge = 225; break;
        case 4: accidentSurcharge = 375; break;
        case 5: accidentSurcharge = 575; break;
        default:
             if (numAccidents > 5)  tooMany = true;
        else   error = true;
}


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