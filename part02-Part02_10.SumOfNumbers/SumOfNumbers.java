
import java.util.Scanner;

public class SumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int input;

        do {
            System.out.print("Give a number:\n");
            input = scanner.nextInt();

            if (input != 0) {
                sum += input;
            }
        } while (input != 0);

        System.out.println("Sum of the numbers: " + sum);
    }
}
