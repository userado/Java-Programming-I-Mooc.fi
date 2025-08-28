
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int count = 0;
        int input;

        do {
            System.out.print("Give a number:\n");
            input = scanner.nextInt();

            if (input != 0) {
                sum += input;
                count++;
            }
        } while (input != 0);

        if (count > 0) {
            double average = (double) sum / count;
            System.out.println("Average of the numbers: " + average);
        } else {
            System.out.println("No numbers were entered.");
        }
    }
}
