
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Ask the user for a number
        System.out.print("Give a number: ");
        int number = scanner.nextInt();

        int factorial = 1;

        // Calculate factorial using a loop
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }

        // Print the result
        System.out.println("Factorial: " + factorial);
    }
}
