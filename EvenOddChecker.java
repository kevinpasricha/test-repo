import java.util.Scanner;

public class EvenOddChecker {

    public static void main(String[] args) {
        Scanner keyb = new Scanner(System.in);
        int number;

        System.out.println("Please enter an integer:");
        number = keyb.nextInt();

        if (number % 2 == 0) {
            System.out.println("The number is even.");
        } else {
            System.out.println("The number " + number + " is odd.");
        }

        keyb.close();  // Close the scanner to prevent resource leaks
    }
}

