
import java.util.Scanner;

public class SumOfASequence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Last number? ");
        int n = scanner.nextInt();

        int sum = 0;

        // Calculate the sum from 1 to n
        for (int i = 1; i <= n; i++) {
            sum += i;
        }

        // Print the result
        System.out.println("The sum is " + sum);
    }
}
