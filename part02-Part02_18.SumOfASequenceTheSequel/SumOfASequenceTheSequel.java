
import java.util.Scanner;

public class SumOfASequenceTheSequel {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Ask for the first number
        System.out.print("First number? ");
        int start = scanner.nextInt();

        // Ask for the last number
        System.out.print("Last number? ");
        int end = scanner.nextInt();

        int sum = 0;

        // Calculate the sum from start to end (inclusive)
        for (int i = start; i <= end; i++) {
            sum += i;
        }

        // Print the sum
        System.out.println("The sum is " + sum);
    }
}
