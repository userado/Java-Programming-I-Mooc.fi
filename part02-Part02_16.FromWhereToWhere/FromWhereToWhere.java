
import java.util.Scanner;

public class FromWhereToWhere {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        // Ask for the upper limit
        System.out.print("Where to? ");
        int end = scanner.nextInt();

        // Ask for the starting point
        System.out.print("Where from? ");
        int start = scanner.nextInt();

        // Print numbers from start to end, inclusive
        for (int i = start; i <= end; i++) {
            System.out.println(i);
        }
    }
}
