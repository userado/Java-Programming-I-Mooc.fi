import java.util.Scanner;

public class AgeOfTheOldest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int maxAge = -1;

        while (true) {
            String line = scanner.nextLine();
            if (line.isEmpty()) {
                break;
            }

            String[] parts = line.split(",");
            if (parts.length == 2) {
                try {
                    int age = Integer.parseInt(parts[1].trim());
                    if (age > maxAge) {
                        maxAge = age;
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Invalid age format: " + parts[1]);
                }
            } else {
                System.out.println("Invalid input format. Please enter as name,age");
            }
        }

        System.out.println("Age of the oldest: " + maxAge);
        scanner.close();
    }
}
