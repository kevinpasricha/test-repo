import  java.util.Scanner;

public class Average3b  {
  public static void main(String[] args)  {
    int sum, average;
    Scanner  keyb = new Scanner(System.in);
    
    System.out.println
                 ("What is the first value\t?");
    int  value1 = keyb.nextInt();
    System.out.println
             ("What is the second value\t?");
    int  value2 = keyb.nextInt();
    System.out.println
               ("What is the third value\t?");
    int  value3 = keyb.nextInt();
    
    sum = value1 + value2 + value3;
    average = sum / 3;
    System.out.println("The average is " 
                            + average);
  }
 }
