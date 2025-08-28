
import java.util.Scanner;

public class NumberOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        int input;

        do {
            System.out.print("Give a number: ");
            input = scanner.nextInt();
            if (input != 0) {
                count++;
            }
        } while (input != 0);

        System.out.println("Number of numbers: " + count);
    }
}

