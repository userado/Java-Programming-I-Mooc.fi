import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        // Read input until 9999 is entered
        while (true) {
            int num = scanner.nextInt();
            if (num == 9999) {
                break;
            }
            numbers.add(num);
        }

        // Find the smallest number
        int smallest = numbers.get(0);
        for (int num : numbers) {
            if (num < smallest) {
                smallest = num;
            }
        }

        // Print the smallest number
        System.out.println("Smallest number: " + smallest);

        // Print indices where the smallest number occurs
        System.out.print("Found at index: ");
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) == smallest) {
                System.out.println(i);
            }
        }

        scanner.close();
    }
}
