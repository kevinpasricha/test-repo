import java.util.Scanner;

public class Polite  {
  // A very polite program that greets you by name
  public static void main(String[] args) {
    String name = new String();
    Scanner keyb = new Scanner(System.in);
    
    // Ask the user his/her name
    System.out.println("What is your name?");
    name = keyb.next(); 
    // Greet the user
    System.out.println("Glad to meet you, " + name);
  }
}
