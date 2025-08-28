
import java.util.Scanner;

public class NumberOfNegativeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int negativeCount = 0;
        int input;

        do {
            System.out.print("Give a number:\n");
            input = scanner.nextInt();

            if (input < 0) {
                negativeCount++;
            }
        } while (input != 0);

        System.out.println("Number of negative numbers: " + negativeCount);
    }
}
