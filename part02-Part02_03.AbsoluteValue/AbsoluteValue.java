
import java.util.Scanner;

public class AbsoluteValue {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = scanner.nextInt();

        if (num < 0) {
            System.out.println(-num); // Convert negative to positive
        } else {
            System.out.println(num);  // Print as-is
        }
    }
}
